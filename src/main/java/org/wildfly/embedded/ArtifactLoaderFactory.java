package org.wildfly.embedded;

import org.jboss.modules.ResourceLoader;
import org.jboss.modules.ResourceLoaders;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;

/**
 * @author Bob McWhirter
 */
public class ArtifactLoaderFactory {

    private Map<String, ResourceLoader> loaders = new HashMap<>();

    public ArtifactLoaderFactory() {
    }

    public synchronized ResourceLoader getLoader(String gav) throws IOException {
        ResourceLoader loader = this.loaders.get(gav);
        if ( loader != null ) {
            return loader;
        }

        File jarFile = getFile( gav );
        if ( jarFile == null ) {
            return null;
        }
        loader = ResourceLoaders.createFileResourceLoader( gav, jarFile );
        System.err.println( "using loader: " + loader );
        this.loaders.put( gav, loader );
        return loader;
    }

    private File getFile(String gav) throws IOException {
        System.err.println( "gavToPath: " + gavToPath(gav));
        InputStream in = this.getClass().getClassLoader().getResourceAsStream(gavToPath(gav));
        if ( in == null ) {
            return null;
        }

        try {
            File tmp = File.createTempFile(gav, ".jar");

            FileOutputStream out = new FileOutputStream(tmp);

            try {
                byte[] buf = new byte[1024];
                int len = -1;

                while ((len = in.read(buf)) >= 0) {
                    out.write(buf, 0, len);
                }
            } finally {
                out.close();
            }
            return tmp;
        } finally {
            in.close();
        }
    }

    private String gavToPath(String gav) {
        String[] parts = gav.split(":");
        return "m2repo/" + parts[0].replaceAll( "\\.", "/" ) + "/" + parts[1] + "/" + parts[2] + "/" + parts[1]  + "-" + parts[2] + ".jar";
    }

}
