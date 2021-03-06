package gio;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/gio/gnativevolumemonitor.h:5</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public class GNativeVolumeMonitor extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GVolumeMonitor */
	@Field(0) 
	public GVolumeMonitor parent_instance() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GVolumeMonitor */
	@Field(0) 
	public GNativeVolumeMonitor parent_instance(GVolumeMonitor parent_instance) {
		this.io.setNativeObjectField(this, 0, parent_instance);
		return this;
	}
	public GNativeVolumeMonitor() {
		super();
	}
	public GNativeVolumeMonitor(Pointer pointer) {
		super(pointer);
	}
}
