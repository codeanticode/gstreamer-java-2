package gobject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GParamSpecInt:<br>
 * @parent_instance: private #GParamSpec portion<br>
 * @minimum: minimum value for the property specified<br>
 * @maximum: maximum value for the property specified<br>
 * @default_value: default value for the property specified<br>
 * <br>
 * A #GParamSpec derived structure that contains the meta data for integer properties.<br>
 * <i>native declaration : glib-2.0/gobject/gparamspecs.h:80</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GParamSpecInt extends StructObject {
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
	public GParamSpecInt parent_instance(GParamSpec parent_instance) {
		this.io.setNativeObjectField(this, 0, parent_instance);
		return this;
	}
	/** C type : gint */
	@Field(1) 
	public int minimum() {
		return this.io.getIntField(this, 1);
	}
	/** C type : gint */
	@Field(1) 
	public GParamSpecInt minimum(int minimum) {
		this.io.setIntField(this, 1, minimum);
		return this;
	}
	/** C type : gint */
	@Field(2) 
	public int maximum() {
		return this.io.getIntField(this, 2);
	}
	/** C type : gint */
	@Field(2) 
	public GParamSpecInt maximum(int maximum) {
		this.io.setIntField(this, 2, maximum);
		return this;
	}
	/** C type : gint */
	@Field(3) 
	public int default_value() {
		return this.io.getIntField(this, 3);
	}
	/** C type : gint */
	@Field(3) 
	public GParamSpecInt default_value(int default_value) {
		this.io.setIntField(this, 3, default_value);
		return this;
	}
	public GParamSpecInt() {
		super();
	}
	public GParamSpecInt(Pointer pointer) {
		super(pointer);
	}
}
