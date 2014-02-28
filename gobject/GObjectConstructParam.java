package gobject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GObjectConstructParam:<br>
 * @pspec: the #GParamSpec of the construct parameter<br>
 * @value: the value to set the parameter to<br>
 * <br>
 * The <structname>GObjectConstructParam</structname> struct is an auxiliary <br>
 * structure used to hand #GParamSpec/#GValue pairs to the @constructor of<br>
 * a #GObjectClass.<br>
 * <i>native declaration : glib-2.0/gobject/gobject.h:164</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GObjectConstructParam extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GParamSpec* */
	@Field(0) 
	public Pointer<GParamSpec > pspec() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : GParamSpec* */
	@Field(0) 
	public GObjectConstructParam pspec(Pointer<GParamSpec > pspec) {
		this.io.setPointerField(this, 0, pspec);
		return this;
	}
	/** C type : GValue* */
	@Field(1) 
	public Pointer<GValue > value() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : GValue* */
	@Field(1) 
	public GObjectConstructParam value(Pointer<GValue > value) {
		this.io.setPointerField(this, 1, value);
		return this;
	}
	public GObjectConstructParam() {
		super();
	}
	public GObjectConstructParam(Pointer pointer) {
		super(pointer);
	}
}
