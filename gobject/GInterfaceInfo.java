package gobject;
import gobject.GObjectLibrary.GInterfaceFinalizeFunc;
import gobject.GObjectLibrary.GInterfaceInitFunc;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GInterfaceInfo:<br>
 * @interface_init: location of the interface initialization function<br>
 * @interface_finalize: location of the interface finalization function<br>
 * @interface_data: user-supplied data passed to the interface init/finalize functions<br>
 * <br>
 * A structure that provides information to the type system which is<br>
 * used specifically for managing interface types.<br>
 * <i>native declaration : glib-2.0/gobject/gtype.h:439</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GInterfaceInfo extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GInterfaceInitFunc */
	@Field(0) 
	public Pointer<GInterfaceInitFunc > interface_init() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : GInterfaceInitFunc */
	@Field(0) 
	public GInterfaceInfo interface_init(Pointer<GInterfaceInitFunc > interface_init) {
		this.io.setPointerField(this, 0, interface_init);
		return this;
	}
	/** C type : GInterfaceFinalizeFunc */
	@Field(1) 
	public Pointer<GInterfaceFinalizeFunc > interface_finalize() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : GInterfaceFinalizeFunc */
	@Field(1) 
	public GInterfaceInfo interface_finalize(Pointer<GInterfaceFinalizeFunc > interface_finalize) {
		this.io.setPointerField(this, 1, interface_finalize);
		return this;
	}
	/**
	 * Failed to convert value interface_data of type gpointer<br>
	 * C type : gpointer
	 */
	public GInterfaceInfo() {
		super();
	}
	public GInterfaceInfo(Pointer pointer) {
		super(pointer);
	}
}