package gobject;
import gobject.GObjectLibrary.GTypePluginCompleteInterfaceInfo;
import gobject.GObjectLibrary.GTypePluginCompleteTypeInfo;
import gobject.GObjectLibrary.GTypePluginUnuse;
import gobject.GObjectLibrary.GTypePluginUse;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GTypePluginClass:<br>
 * @use_plugin: Increases the use count of the plugin.<br>
 * @unuse_plugin: Decreases the use count of the plugin.<br>
 * @complete_type_info: Fills in the #GTypeInfo and <br>
 *  #GTypeValueTable structs for the type. The structs are initialized<br>
 *  with <literal>memset(s, 0, sizeof (s))</literal> before calling <br>
 *  this function.<br>
 * @complete_interface_info: Fills in missing parts of the #GInterfaceInfo <br>
 *  for the interface. The structs is initialized with <br>
 *  <literal>memset(s, 0, sizeof (s))</literal> before calling<br>
 *  this function.<br>
 * <br>
 * The #GTypePlugin interface is used by the type system in order to handle<br>
 * the lifecycle of dynamically loaded types.<br>
 * <i>native declaration : glib-2.0/gobject/gtypeplugin.h:63</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GTypePluginClass extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * < private ><br>
	 * C type : GTypeInterface
	 */
	@Field(0) 
	public GTypeInterface base_iface() {
		return this.io.getNativeObjectField(this, 0);
	}
	/**
	 * < private ><br>
	 * C type : GTypeInterface
	 */
	@Field(0) 
	public GTypePluginClass base_iface(GTypeInterface base_iface) {
		this.io.setNativeObjectField(this, 0, base_iface);
		return this;
	}
	/**
	 * < public ><br>
	 * C type : GTypePluginUse
	 */
	@Field(1) 
	public Pointer<GTypePluginUse > use_plugin() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * < public ><br>
	 * C type : GTypePluginUse
	 */
	@Field(1) 
	public GTypePluginClass use_plugin(Pointer<GTypePluginUse > use_plugin) {
		this.io.setPointerField(this, 1, use_plugin);
		return this;
	}
	/** C type : GTypePluginUnuse */
	@Field(2) 
	public Pointer<GTypePluginUnuse > unuse_plugin() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : GTypePluginUnuse */
	@Field(2) 
	public GTypePluginClass unuse_plugin(Pointer<GTypePluginUnuse > unuse_plugin) {
		this.io.setPointerField(this, 2, unuse_plugin);
		return this;
	}
	/** C type : GTypePluginCompleteTypeInfo */
	@Field(3) 
	public Pointer<GTypePluginCompleteTypeInfo > complete_type_info() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : GTypePluginCompleteTypeInfo */
	@Field(3) 
	public GTypePluginClass complete_type_info(Pointer<GTypePluginCompleteTypeInfo > complete_type_info) {
		this.io.setPointerField(this, 3, complete_type_info);
		return this;
	}
	/** C type : GTypePluginCompleteInterfaceInfo */
	@Field(4) 
	public Pointer<GTypePluginCompleteInterfaceInfo > complete_interface_info() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : GTypePluginCompleteInterfaceInfo */
	@Field(4) 
	public GTypePluginClass complete_interface_info(Pointer<GTypePluginCompleteInterfaceInfo > complete_interface_info) {
		this.io.setPointerField(this, 4, complete_interface_info);
		return this;
	}
	public GTypePluginClass() {
		super();
	}
	public GTypePluginClass(Pointer pointer) {
		super(pointer);
	}
}