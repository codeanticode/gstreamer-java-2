package gobject;
import gobject.GObjectLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Bits;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * GClosure:<br>
 * @in_marshal: Indicates whether the closure is currently being invoked with <br>
 *  g_closure_invoke()<br>
 * @is_invalid: Indicates whether the closure has been invalidated by <br>
 *  g_closure_invalidate()<br>
 * <br>
 * A #GClosure represents a callback supplied by the programmer.<br>
 * <i>native declaration : glib-2.0/gobject/gclosure.h:90</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GClosure extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * < private ><br>
	 * C type : volatile guint
	 */
	@Field(0) 
	@Bits(15) 
	public int ref_count() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * < private ><br>
	 * C type : volatile guint
	 */
	@Field(0) 
	@Bits(15) 
	public GClosure ref_count(int ref_count) {
		this.io.setIntField(this, 0, ref_count);
		return this;
	}
	/**
	 * meta_marshal is not used anymore but must be zero for historical reasons<br>
	 * as it was exposed in the G_CLOSURE_N_NOTIFIERS macro<br>
	 * C type : volatile guint
	 */
	@Field(1) 
	@Bits(1) 
	public int meta_marshal_nouse() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * meta_marshal is not used anymore but must be zero for historical reasons<br>
	 * as it was exposed in the G_CLOSURE_N_NOTIFIERS macro<br>
	 * C type : volatile guint
	 */
	@Field(1) 
	@Bits(1) 
	public GClosure meta_marshal_nouse(int meta_marshal_nouse) {
		this.io.setIntField(this, 1, meta_marshal_nouse);
		return this;
	}
	/** C type : volatile guint */
	@Field(2) 
	@Bits(1) 
	public int n_guards() {
		return this.io.getIntField(this, 2);
	}
	/** C type : volatile guint */
	@Field(2) 
	@Bits(1) 
	public GClosure n_guards(int n_guards) {
		this.io.setIntField(this, 2, n_guards);
		return this;
	}
	/**
	 * finalization notifiers<br>
	 * C type : volatile guint
	 */
	@Field(3) 
	@Bits(2) 
	public int n_fnotifiers() {
		return this.io.getIntField(this, 3);
	}
	/**
	 * finalization notifiers<br>
	 * C type : volatile guint
	 */
	@Field(3) 
	@Bits(2) 
	public GClosure n_fnotifiers(int n_fnotifiers) {
		this.io.setIntField(this, 3, n_fnotifiers);
		return this;
	}
	/**
	 * invalidation notifiers<br>
	 * C type : volatile guint
	 */
	@Field(4) 
	@Bits(8) 
	public int n_inotifiers() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * invalidation notifiers<br>
	 * C type : volatile guint
	 */
	@Field(4) 
	@Bits(8) 
	public GClosure n_inotifiers(int n_inotifiers) {
		this.io.setIntField(this, 4, n_inotifiers);
		return this;
	}
	/** C type : volatile guint */
	@Field(5) 
	@Bits(1) 
	public int in_inotify() {
		return this.io.getIntField(this, 5);
	}
	/** C type : volatile guint */
	@Field(5) 
	@Bits(1) 
	public GClosure in_inotify(int in_inotify) {
		this.io.setIntField(this, 5, in_inotify);
		return this;
	}
	/** C type : volatile guint */
	@Field(6) 
	@Bits(1) 
	public int floating() {
		return this.io.getIntField(this, 6);
	}
	/** C type : volatile guint */
	@Field(6) 
	@Bits(1) 
	public GClosure floating(int floating) {
		this.io.setIntField(this, 6, floating);
		return this;
	}
	/**
	 * < protected ><br>
	 * C type : volatile guint
	 */
	@Field(7) 
	@Bits(1) 
	public int derivative_flag() {
		return this.io.getIntField(this, 7);
	}
	/**
	 * < protected ><br>
	 * C type : volatile guint
	 */
	@Field(7) 
	@Bits(1) 
	public GClosure derivative_flag(int derivative_flag) {
		this.io.setIntField(this, 7, derivative_flag);
		return this;
	}
	/**
	 * < public ><br>
	 * C type : volatile guint
	 */
	@Field(8) 
	@Bits(1) 
	public int in_marshal() {
		return this.io.getIntField(this, 8);
	}
	/**
	 * < public ><br>
	 * C type : volatile guint
	 */
	@Field(8) 
	@Bits(1) 
	public GClosure in_marshal(int in_marshal) {
		this.io.setIntField(this, 8, in_marshal);
		return this;
	}
	/** C type : volatile guint */
	@Field(9) 
	@Bits(1) 
	public int is_invalid() {
		return this.io.getIntField(this, 9);
	}
	/** C type : volatile guint */
	@Field(9) 
	@Bits(1) 
	public GClosure is_invalid(int is_invalid) {
		this.io.setIntField(this, 9, is_invalid);
		return this;
	}
	/**
	 * < private ><br>
	 * C type : marshal_callback*
	 */
	@Field(10) 
	public Pointer<GClosure.marshal_callback > marshal() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * < private ><br>
	 * C type : marshal_callback*
	 */
	@Field(10) 
	public GClosure marshal(Pointer<GClosure.marshal_callback > marshal) {
		this.io.setPointerField(this, 10, marshal);
		return this;
	}
	/**
	 * Failed to convert value data of type gpointer<br>
	 * C type : gpointer
	 */
	/**
	 * < private ><br>
	 * C type : GClosureNotifyData*
	 */
	@Field(12) 
	public Pointer<GClosureNotifyData > notifiers() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * < private ><br>
	 * C type : GClosureNotifyData*
	 */
	@Field(12) 
	public GClosure notifiers(Pointer<GClosureNotifyData > notifiers) {
		this.io.setPointerField(this, 12, notifiers);
		return this;
	}
	/** <i>native declaration : glib-2.0/gobject/gclosure.h:89</i> */
	public static abstract class marshal_callback extends Callback<marshal_callback > {
		public final void apply(Pointer<GClosure > closure, Pointer<GValue > return_value, int n_param_values, Pointer<GValue > param_values, gpointer invocation_hint, gpointer marshal_data) {
			apply(Pointer.getPeer(closure), Pointer.getPeer(return_value), n_param_values, Pointer.getPeer(param_values), invocation_hint, marshal_data);
		}
		public abstract void apply(@Ptr long closure, @Ptr long return_value, int n_param_values, @Ptr long param_values, gpointer invocation_hint, gpointer marshal_data);
	};
	public GClosure() {
		super();
	}
	public GClosure(Pointer pointer) {
		super(pointer);
	}
}
