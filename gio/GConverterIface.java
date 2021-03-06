package gio;
import gio.GIOLibrary.GConverter;
import gio.GIOLibrary.GConverterFlags;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * GConverterIface:<br>
 * @g_iface: The parent interface.<br>
 * @convert: Converts data.<br>
 * @reset: Reverts the internal state of the converter to its initial state.<br>
 * * Provides an interface for converting data from one type<br>
 * to another type. The conversion can be stateful<br>
 * and may fail at any place.<br>
 * * Since: 2.24<br>
 * <i>native declaration : glib-2.0/gio/gconverter.h:24</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GConverterIface extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GTypeInterface (Unsupported type) */
	/** C type : reset_callback* */
	@Field(1) 
	public Pointer<gio.GSettingsBackendClass.reset_callback > reset() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : reset_callback* */
	@Field(1) 
	public GConverterIface reset(Pointer<gio.GSettingsBackendClass.reset_callback > reset) {
		this.io.setPointerField(this, 1, reset);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gconverter.h:22</i> */
	public static abstract class GConverterResult_callback extends Callback<GConverterResult_callback > {
		public final void apply(Pointer<GConverter > converter, Pointer<? > inbuf, @org.bridj.ann.CLong long inbuf_size, Pointer<? > outbuf, @org.bridj.ann.CLong long outbuf_size, IntValuedEnum<GConverterFlags > flags, Pointer<org.bridj.CLong > bytes_read, Pointer<org.bridj.CLong > bytes_written, Pointer<Pointer > error) {
			apply(Pointer.getPeer(converter), Pointer.getPeer(inbuf), inbuf_size, Pointer.getPeer(outbuf), outbuf_size, (int)flags.value(), Pointer.getPeer(bytes_read), Pointer.getPeer(bytes_written), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long converter, @Ptr long inbuf, @org.bridj.ann.CLong long inbuf_size, @Ptr long outbuf, @org.bridj.ann.CLong long outbuf_size, int flags, @Ptr long bytes_read, @Ptr long bytes_written, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gconverter.h:23</i> */
	public static abstract class reset_callback extends Callback<reset_callback > {
		public final void apply(Pointer<GConverter > converter) {
			apply(Pointer.getPeer(converter));
		}
		public abstract void apply(@Ptr long converter);
	};
}
