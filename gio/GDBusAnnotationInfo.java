package gio;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GDBusAnnotationInfo:<br>
 * @ref_count: The reference count or -1 if statically allocated.<br>
 * @key: The name of the annotation, e.g. "org.freedesktop.DBus.Deprecated".<br>
 * @value: The value of the annotation.<br>
 * @annotations: (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.<br>
 * * Information about an annotation.<br>
 * * Since: 2.26<br>
 * <i>native declaration : glib-2.0/gio/gdbusintrospection.h:16</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public class GDBusAnnotationInfo extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * < public ><br>
	 * C type : volatile gint
	 */
	@Field(0) 
	public int ref_count() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * < public ><br>
	 * C type : volatile gint
	 */
	@Field(0) 
	public GDBusAnnotationInfo ref_count(int ref_count) {
		this.io.setIntField(this, 0, ref_count);
		return this;
	}
	/** C type : gchar* */
	@Field(1) 
	public Pointer<Byte > key() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : gchar* */
	@Field(1) 
	public GDBusAnnotationInfo key(Pointer<Byte > key) {
		this.io.setPointerField(this, 1, key);
		return this;
	}
	/** C type : gchar* */
	@Field(2) 
	public Pointer<Byte > value() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : gchar* */
	@Field(2) 
	public GDBusAnnotationInfo value(Pointer<Byte > value) {
		this.io.setPointerField(this, 2, value);
		return this;
	}
	/** C type : GDBusAnnotationInfo** */
	@Field(3) 
	public Pointer<Pointer<GDBusAnnotationInfo > > annotations() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : GDBusAnnotationInfo** */
	@Field(3) 
	public GDBusAnnotationInfo annotations(Pointer<Pointer<GDBusAnnotationInfo > > annotations) {
		this.io.setPointerField(this, 3, annotations);
		return this;
	}
	public GDBusAnnotationInfo() {
		super();
	}
	public GDBusAnnotationInfo(Pointer pointer) {
		super(pointer);
	}
}
