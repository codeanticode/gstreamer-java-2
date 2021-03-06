package gobject;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
/**
 * GTypeCValue:<br>
 * @v_int: the field for holding integer values<br>
 * @v_long: the field for holding long integer values<br>
 * @v_int64: the field for holding 64 bit integer values<br>
 * @v_double: the field for holding floating point values<br>
 * @v_pointer: the field for holding pointers<br>
 * <br>
 * A union holding one collected value.<br>
 * <i>native declaration : glib-2.0/gobject/gvaluecollector.h:31</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Union 
@Library("GObject") 
public class GTypeCValue extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : gint */
	@Field(0) 
	public int v_int() {
		return this.io.getIntField(this, 0);
	}
	/** C type : gint */
	@Field(0) 
	public GTypeCValue v_int(int v_int) {
		this.io.setIntField(this, 0, v_int);
		return this;
	}
	/** C type : glong */
	@CLong 
	@Field(1) 
	public long v_long() {
		return this.io.getCLongField(this, 1);
	}
	/** C type : glong */
	@CLong 
	@Field(1) 
	public GTypeCValue v_long(long v_long) {
		this.io.setCLongField(this, 1, v_long);
		return this;
	}
	/** C type : gint64 */
	@Field(2) 
	public long v_int64() {
		return this.io.getLongField(this, 2);
	}
	/** C type : gint64 */
	@Field(2) 
	public GTypeCValue v_int64(long v_int64) {
		this.io.setLongField(this, 2, v_int64);
		return this;
	}
	/** C type : gdouble */
	@Field(3) 
	public double v_double() {
		return this.io.getDoubleField(this, 3);
	}
	/** C type : gdouble */
	@Field(3) 
	public GTypeCValue v_double(double v_double) {
		this.io.setDoubleField(this, 3, v_double);
		return this;
	}
	/**
	 * Failed to convert value v_pointer of type gpointer<br>
	 * C type : gpointer
	 */
	public GTypeCValue() {
		super();
	}
	public GTypeCValue(Pointer pointer) {
		super(pointer);
	}
}
