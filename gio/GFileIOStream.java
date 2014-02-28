package gio;
import org.bridj.BridJ;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/gio/gfileiostream.h:13</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GFileIOStream extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GIOStream */
	@Field(0) 
	public GIOStream parent_instance() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GIOStream */
	@Field(0) 
	public GFileIOStream parent_instance(GIOStream parent_instance) {
		this.io.setNativeObjectField(this, 0, parent_instance);
		return this;
	}
	/** Conversion Error : GFileIOStreamPrivate* (failed to convert type to Java (undefined type)) */
}