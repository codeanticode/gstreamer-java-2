package glib;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
/**
 * <i>native declaration : glib-2.0/glib/gscanner.h:57</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Union 
@Library("GLib") 
public abstract class GTokenValue extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : gpointer (Unsupported type) */
	/** C type : gchar* */
	@Field(1) 
	public Pointer<Byte > v_identifier() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : gchar* */
	@Field(1) 
	public GTokenValue v_identifier(Pointer<Byte > v_identifier) {
		this.io.setPointerField(this, 1, v_identifier);
		return this;
	}
	/** C type : gulong */
	@CLong 
	@Field(2) 
	public long v_binary() {
		return this.io.getCLongField(this, 2);
	}
	/** C type : gulong */
	@CLong 
	@Field(2) 
	public GTokenValue v_binary(long v_binary) {
		this.io.setCLongField(this, 2, v_binary);
		return this;
	}
	/** C type : gulong */
	@CLong 
	@Field(3) 
	public long v_octal() {
		return this.io.getCLongField(this, 3);
	}
	/** C type : gulong */
	@CLong 
	@Field(3) 
	public GTokenValue v_octal(long v_octal) {
		this.io.setCLongField(this, 3, v_octal);
		return this;
	}
	/** C type : gulong */
	@CLong 
	@Field(4) 
	public long v_int() {
		return this.io.getCLongField(this, 4);
	}
	/** C type : gulong */
	@CLong 
	@Field(4) 
	public GTokenValue v_int(long v_int) {
		this.io.setCLongField(this, 4, v_int);
		return this;
	}
	/** C type : guint64 */
	@Field(5) 
	public long v_int64() {
		return this.io.getLongField(this, 5);
	}
	/** C type : guint64 */
	@Field(5) 
	public GTokenValue v_int64(long v_int64) {
		this.io.setLongField(this, 5, v_int64);
		return this;
	}
	/** C type : gdouble */
	@Field(6) 
	public double v_float() {
		return this.io.getDoubleField(this, 6);
	}
	/** C type : gdouble */
	@Field(6) 
	public GTokenValue v_float(double v_float) {
		this.io.setDoubleField(this, 6, v_float);
		return this;
	}
	/** C type : gulong */
	@CLong 
	@Field(7) 
	public long v_hex() {
		return this.io.getCLongField(this, 7);
	}
	/** C type : gulong */
	@CLong 
	@Field(7) 
	public GTokenValue v_hex(long v_hex) {
		this.io.setCLongField(this, 7, v_hex);
		return this;
	}
	/** C type : gchar* */
	@Field(8) 
	public Pointer<Byte > v_string() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : gchar* */
	@Field(8) 
	public GTokenValue v_string(Pointer<Byte > v_string) {
		this.io.setPointerField(this, 8, v_string);
		return this;
	}
	/** C type : gchar* */
	@Field(9) 
	public Pointer<Byte > v_comment() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : gchar* */
	@Field(9) 
	public GTokenValue v_comment(Pointer<Byte > v_comment) {
		this.io.setPointerField(this, 9, v_comment);
		return this;
	}
	/** C type : guchar */
	@Field(10) 
	public byte v_char() {
		return this.io.getByteField(this, 10);
	}
	/** C type : guchar */
	@Field(10) 
	public GTokenValue v_char(byte v_char) {
		this.io.setByteField(this, 10, v_char);
		return this;
	}
	/** C type : guint */
	@Field(11) 
	public int v_error() {
		return this.io.getIntField(this, 11);
	}
	/** C type : guint */
	@Field(11) 
	public GTokenValue v_error(int v_error) {
		this.io.setIntField(this, 11, v_error);
		return this;
	}
}
