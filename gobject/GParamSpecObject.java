package gobject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GParamSpecObject:<br>
 * @parent_instance: private #GParamSpec portion<br>
 * <br>
 * A #GParamSpec derived structure that contains the meta data for object properties.<br>
 * <i>native declaration : glib-2.0/gobject/gparamspecs.h:302</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GParamSpecObject extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GParamSpec */
	@Field(0) 
	public GParamSpec parent_instance() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GParamSpec */
	@Field(0) 
	public GParamSpecObject parent_instance(GParamSpec parent_instance) {
		this.io.setNativeObjectField(this, 0, parent_instance);
		return this;
	}
	public GParamSpecObject() {
		super();
	}
	public GParamSpecObject(Pointer pointer) {
		super(pointer);
	}
}