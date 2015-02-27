package modules.system.layers.base.javax.api.main;

import org.wildfly.embedded.modules.BaseModule;
import org.wildfly.embedded.modules.ModuleDependency;

/**
 * @author Bob McWhirter
 */
public class Module extends BaseModule {

    public Module() {
        super("javax.api");

        module("javax.sql.api").export();

        system()
                .path("javax/accessibility")
                .path("javax/annotation/processing")
                .path("javax/activity")
                .path("javax/crypto")
                .path("javax/crypto/interfaces")
                .path("javax/crypto/spec")
                .path("javax/imageio")
                .path("javax/imageio/event")
                .path("javax/imageio/metadata")
                .path("javax/imageio/plugins/bmp")
                .path("javax/imageio/plugins/jpeg")
                .path("javax/imageio/spi")
                .path("javax/imageio/stream")
                .path("javax/lang/model")
                .path("javax/lang/model/element")
                .path("javax/lang/model/type")
                .path("javax/lang/model/util")
                .path("javax/management")
                .path("javax/management/loading")
                .path("javax/management/modelmbean")
                .path("javax/management/monitor")
                .path("javax/management/openmbean")
                .path("javax/management/relation")
                .path("javax/management/remote")
                .path("javax/management/remote/rmi")
                .path("javax/management/timer")
                .path("javax/naming")
                .path("javax/naming/directory")
                .path("javax/naming/event")
                .path("javax/naming/ldap")
                .path("javax/naming/spi")
                .path("javax/net")
                .path("javax/net/ssl")
                .path("javax/print")
                .path("javax/print/attribute")
                .path("javax/print/attribute/standard")
                .path("javax/print/event")
                .path("javax/rmi/ssl")
                .path("javax/script")
                .path("javax/security/auth")
                .path("javax/security/auth/callback")
                .path("javax/security/auth/kerberos")
                .path("javax/security/auth/login")
                .path("javax/security/auth/spi")
                .path("javax/security/auth/x500")
                .path("javax/security/cert")
                .path("javax/security/sasl")
                .path("javax/sound/midi")
                .path("javax/sound/midi/spi")
                .path("javax/sound/sampled")
                .path("javax/sound/sampled/spi")
                .path("javax/sql")
                .path("javax/sql/rowset")
                .path("javax/sql/rowset/serial")
                .path("javax/sql/rowset/spi")
                .path("javax/swing")
                .path("javax/swing/border")
                .path("javax/swing/colorchooser")
                .path("javax/swing/event")
                .path("javax/swing/filechooser")
                .path("javax/swing/plaf")
                .path("javax/swing/plaf/basic")
                .path("javax/swing/plaf/metal")
                .path("javax/swing/plaf/multi" / >
                .path("javax/swing/plaf/nimbus" / >
                .path("javax/swing/plaf/synth" / >
                .path("javax/swing/table" / >
                .path("javax/swing/text" / >
                .path("javax/swing/text/html" / >
                .path("javax/swing/text/html/parser" / >
                .path("javax/swing/text/rtf" / >
                .path("javax/swing/tree" / >
                .path("javax/swing/undo" / >
                .path("javax/tools" / >
                .path("javax/xml" / >
                .path("javax/xml/crypto" / >
                .path("javax/xml/crypto/dom" / >
                .path("javax/xml/crypto/dsig" / >
                .path("javax/xml/crypto/dsig/dom" / >
                .path("javax/xml/crypto/dsig/keyinfo" / >
                .path("javax/xml/crypto/dsig/spec" / >
                .path("javax/xml/datatype" / >
                .path("javax/xml/namespace")
                .path("javax/xml/parsers")
                .path("javax/xml/stream")
                .path("javax/xml/stream/events")
                .path("javax/xml/stream/util")
                .path("javax/xml/transform")
                .path("javax/xml/transform/dom")
                .path("javax/xml/transform/sax")
                .path("javax/xml/transform/stax")
                .path("javax/xml/transform/stream")
                .path("javax/xml/validation")
                .path("javax/xml/xpath")
                .path("org/ietf/jgss")
                .path("org/w3c/dom")
                .path("org/w3c/dom/bootstrap")
                .path("org/w3c/dom/css")
                .path("org/w3c/dom/events")
                .path("org/w3c/dom/html")
                .path("org/w3c/dom/ranges")
                .path("org/w3c/dom/stylesheets")
                .path("org/w3c/dom/traversal")
                .path("org/w3c/dom/ls")
                .path("org/w3c/dom/views")
                .path("org/w3c/dom/xpath")
                .path("org/xml/sax")
                .path("org/xml/sax/ext")
                .path("org/xml/sax/helpers")
    }
}
