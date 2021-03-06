package gobject;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * GParamSpecTypeInfo:<br>
 * @instance_size: Size of the instance (object) structure.<br>
 * @n_preallocs: Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the <link linkend="glib-Memory-Slices">slice allocator</link> now.<br>
 * @instance_init: Location of the instance initialization function (optional).<br>
 * @value_type: The #GType of values conforming to this #GParamSpec<br>
 * @finalize: The instance finalization function (optional).<br>
 * @value_set_default: Resets a @value to the default value for @pspec <br>
 *  (recommended, the default is g_value_reset()), see <br>
 *  g_param_value_set_default().<br>
 * @value_validate: Ensures that the contents of @value comply with the <br>
 *  specifications set out by @pspec (optional), see <br>
 *  g_param_value_validate().<br>
 * @values_cmp: Compares @value1 with @value2 according to @pspec <br>
 *  (recommended, the default is memcmp()), see g_param_values_cmp().<br>
 * <br>
 * This structure is used to provide the type system with the information<br>
 * required to initialize and destruct (finalize) a parameter's class and<br>
 * instances thereof.<br>
 * The initialized structure is passed to the g_param_type_register_static() <br>
 * The type system will perform a deep copy of this structure, so its memory <br>
 * does not need to be persistent across invocation of <br>
 * g_param_type_register_static().<br>
 * <i>native declaration : glib-2.0/gobject/gparam.h:215</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GObject") 
public class GParamSpecTypeInfo extends CPPObject {
	static {
		BridJ.register();
	}
	/**
	 * type system portion<br>
	 * obligatory<br>
	 * C type : guint16
	 */
	@Field(0) 
	public short instance_size() {
		return this.io.getShortField(this, 0);
	}
	/**
	 * type system portion<br>
	 * obligatory<br>
	 * C type : guint16
	 */
	@Field(0) 
	public GParamSpecTypeInfo instance_size(short instance_size) {
		this.io.setShortField(this, 0, instance_size);
		return this;
	}
	/**
	 * optional<br>
	 * C type : guint16
	 */
	@Field(1) 
	public short n_preallocs() {
		return this.io.getShortField(this, 1);
	}
	/**
	 * optional<br>
	 * C type : guint16
	 */
	@Field(1) 
	public GParamSpecTypeInfo n_preallocs(short n_preallocs) {
		this.io.setShortField(this, 1, n_preallocs);
		return this;
	}
	/**
	 * optional<br>
	 * C type : instance_init_callback*
	 */
	@Field(2) 
	public Pointer<GParamSpecTypeInfo.instance_init_callback > instance_init() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * optional<br>
	 * C type : instance_init_callback*
	 */
	@Field(2) 
	public GParamSpecTypeInfo instance_init(Pointer<GParamSpecTypeInfo.instance_init_callback > instance_init) {
		this.io.setPointerField(this, 2, instance_init);
		return this;
	}
	/**
	 * class portion<br>
	 * obligatory<br>
	 * C type : GType
	 */
	@CLong 
	@Field(3) 
	public long value_type() {
		return this.io.getCLongField(this, 3);
	}
	/**
	 * class portion<br>
	 * obligatory<br>
	 * C type : GType
	 */
	@CLong 
	@Field(3) 
	public GParamSpecTypeInfo value_type(long value_type) {
		this.io.setCLongField(this, 3, value_type);
		return this;
	}
	/**
	 * optional<br>
	 * C type : finalize_callback*
	 */
	@Field(4) 
	public Pointer<gobject.GObjectClass.finalize_callback > finalize$() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * optional<br>
	 * C type : finalize_callback*
	 */
	@Field(4) 
	public GParamSpecTypeInfo finalize$(Pointer<gobject.GObjectClass.finalize_callback > finalize$) {
		this.io.setPointerField(this, 4, finalize$);
		return this;
	}
	/**
	 * recommended<br>
	 * C type : value_set_default_callback*
	 */
	@Field(5) 
	public Pointer<GParamSpecTypeInfo.value_set_default_callback > value_set_default() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * recommended<br>
	 * C type : value_set_default_callback*
	 */
	@Field(5) 
	public GParamSpecTypeInfo value_set_default(Pointer<GParamSpecTypeInfo.value_set_default_callback > value_set_default) {
		this.io.setPointerField(this, 5, value_set_default);
		return this;
	}
	/**
	 * recommended<br>
	 * C type : values_cmp_callback*
	 */
	@Field(6) 
	public Pointer<GParamSpecTypeInfo.values_cmp_callback > values_cmp() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * recommended<br>
	 * C type : values_cmp_callback*
	 */
	@Field(6) 
	public GParamSpecTypeInfo values_cmp(Pointer<GParamSpecTypeInfo.values_cmp_callback > values_cmp) {
		this.io.setPointerField(this, 6, values_cmp);
		return this;
	}
	/** <i>native declaration : glib-2.0/gobject/gparam.h:210</i> */
	public static abstract class instance_init_callback extends Callback<instance_init_callback > {
		public final void apply(Pointer<GParamSpec > pspec) {
			apply(Pointer.getPeer(pspec));
		}
		public abstract void apply(@Ptr long pspec);
	};
	/** <i>native declaration : glib-2.0/gobject/gparam.h:211</i> */
	public static abstract class finalize_callback extends Callback<finalize_callback > {
		public final void apply(Pointer<GParamSpec > pspec) {
			apply(Pointer.getPeer(pspec));
		}
		public abstract void apply(@Ptr long pspec);
	};
	/** <i>native declaration : glib-2.0/gobject/gparam.h:212</i> */
	public static abstract class value_set_default_callback extends Callback<value_set_default_callback > {
		/** @param pspec recommended */
		public final void apply(Pointer<GParamSpec > pspec, Pointer<GValue > value) {
			apply(Pointer.getPeer(pspec), Pointer.getPeer(value));
		}
		public abstract void apply(@Ptr long pspec, @Ptr long value);
	};
	/** <i>native declaration : glib-2.0/gobject/gparam.h:213</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		/** @param pspec optional */
		public final void apply(Pointer<GParamSpec > pspec, Pointer<GValue > value) {
			apply(Pointer.getPeer(pspec), Pointer.getPeer(value));
		}
		public abstract void apply(@Ptr long pspec, @Ptr long value);
	};
	/** <i>native declaration : glib-2.0/gobject/gparam.h:214</i> */
	public static abstract class values_cmp_callback extends Callback<values_cmp_callback > {
		/** @param pspec recommended */
		public final int apply(Pointer<GParamSpec > pspec, Pointer<GValue > value1, Pointer<GValue > value2) {
			return apply(Pointer.getPeer(pspec), Pointer.getPeer(value1), Pointer.getPeer(value2));
		}
		public abstract int apply(@Ptr long pspec, @Ptr long value1, @Ptr long value2);
	};
	public GParamSpecTypeInfo() {
		super();
	}
	public GParamSpecTypeInfo(Pointer pointer) {
		super(pointer);
	}
}
