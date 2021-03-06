package gobject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GParamSpecUnichar:<br>
 * @parent_instance: private #GParamSpec portion<br>
 * @default_value: default value for the property specified<br>
 * <br>
 * A #GParamSpec derived structure that contains the meta data for unichar (unsigned integer) properties.<br>
 * <i>native declaration : glib-2.0/gobject/gparamspecs.h:166</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GParamSpecUnichar extends StructObject {
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
	public GParamSpecUnichar parent_instance(GParamSpec parent_instance) {
		this.io.setNativeObjectField(this, 0, parent_instance);
		return this;
	}
	/** C type : gunichar */
	@Field(1) 
	public int default_value() {
		return this.io.getIntField(this, 1);
	}
	/** C type : gunichar */
	@Field(1) 
	public GParamSpecUnichar default_value(int default_value) {
		this.io.setIntField(this, 1, default_value);
		return this;
	}
	public GParamSpecUnichar() {
		super();
	}
	public GParamSpecUnichar(Pointer pointer) {
		super(pointer);
	}
}
