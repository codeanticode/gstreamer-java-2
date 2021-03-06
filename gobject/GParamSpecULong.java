package gobject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GParamSpecULong:<br>
 * @parent_instance: private #GParamSpec portion<br>
 * @minimum: minimum value for the property specified<br>
 * @maximum: maximum value for the property specified<br>
 * @default_value: default value for the property specified<br>
 * <br>
 * A #GParamSpec derived structure that contains the meta data for unsigned long integer properties.<br>
 * <i>native declaration : glib-2.0/gobject/gparamspecs.h:125</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GParamSpecULong extends StructObject {
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
	public GParamSpecULong parent_instance(GParamSpec parent_instance) {
		this.io.setNativeObjectField(this, 0, parent_instance);
		return this;
	}
	/** C type : gulong */
	@CLong 
	@Field(1) 
	public long minimum() {
		return this.io.getCLongField(this, 1);
	}
	/** C type : gulong */
	@CLong 
	@Field(1) 
	public GParamSpecULong minimum(long minimum) {
		this.io.setCLongField(this, 1, minimum);
		return this;
	}
	/** C type : gulong */
	@CLong 
	@Field(2) 
	public long maximum() {
		return this.io.getCLongField(this, 2);
	}
	/** C type : gulong */
	@CLong 
	@Field(2) 
	public GParamSpecULong maximum(long maximum) {
		this.io.setCLongField(this, 2, maximum);
		return this;
	}
	/** C type : gulong */
	@CLong 
	@Field(3) 
	public long default_value() {
		return this.io.getCLongField(this, 3);
	}
	/** C type : gulong */
	@CLong 
	@Field(3) 
	public GParamSpecULong default_value(long default_value) {
		this.io.setCLongField(this, 3, default_value);
		return this;
	}
	public GParamSpecULong() {
		super();
	}
	public GParamSpecULong(Pointer pointer) {
		super(pointer);
	}
}
