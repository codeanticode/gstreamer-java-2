package gio;
import gio.GIOLibrary.GAsyncReadyCallback;
import gio.GIOLibrary.GAsyncResult;
import gio.GIOLibrary.GLoadableIcon;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * GLoadableIconIface:<br>
 * @g_iface: The parent interface.<br>
 * @load: Loads an icon.<br>
 * @load_async: Loads an icon asynchronously.<br>
 * @load_finish: Finishes an asynchronous icon load.<br>
 * * Interface for icons that can be loaded as a stream.<br>
 * <i>native declaration : glib-2.0/gio/gloadableicon.h:23</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GLoadableIconIface extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GTypeInterface (Unsupported type) */
	/** C type : load_callback* */
	@Field(1) 
	public Pointer<GLoadableIconIface.load_callback > load() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : load_callback* */
	@Field(1) 
	public GLoadableIconIface load(Pointer<GLoadableIconIface.load_callback > load) {
		this.io.setPointerField(this, 1, load);
		return this;
	}
	/** C type : load_async_callback* */
	@Field(2) 
	public Pointer<GLoadableIconIface.load_async_callback > load_async() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : load_async_callback* */
	@Field(2) 
	public GLoadableIconIface load_async(Pointer<GLoadableIconIface.load_async_callback > load_async) {
		this.io.setPointerField(this, 2, load_async);
		return this;
	}
	/** C type : load_finish_callback* */
	@Field(3) 
	public Pointer<GLoadableIconIface.load_finish_callback > load_finish() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : load_finish_callback* */
	@Field(3) 
	public GLoadableIconIface load_finish(Pointer<GLoadableIconIface.load_finish_callback > load_finish) {
		this.io.setPointerField(this, 3, load_finish);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gloadableicon.h:20</i> */
	public static abstract class load_callback extends Callback<load_callback > {
		public final Pointer<GInputStream > apply(Pointer<GLoadableIcon > icon, int size, Pointer<Pointer<Byte > > type, Pointer<GCancellable > cancellable, Pointer<Pointer > error) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(icon), size, Pointer.getPeer(type), Pointer.getPeer(cancellable), Pointer.getPeer(error)), GInputStream.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long icon, int size, @Ptr long type, @Ptr long cancellable, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gloadableicon.h:21</i> */
	public static abstract class load_async_callback extends Callback<load_async_callback > {
		public final void apply(Pointer<GLoadableIcon > icon, int size, Pointer<GCancellable > cancellable, Pointer<GAsyncReadyCallback > callback, gpointer user_data) {
			apply(Pointer.getPeer(icon), size, Pointer.getPeer(cancellable), Pointer.getPeer(callback), user_data);
		}
		public abstract void apply(@Ptr long icon, int size, @Ptr long cancellable, @Ptr long callback, gpointer user_data);
	};
	/** <i>native declaration : glib-2.0/gio/gloadableicon.h:22</i> */
	public static abstract class load_finish_callback extends Callback<load_finish_callback > {
		public final Pointer<GInputStream > apply(Pointer<GLoadableIcon > icon, Pointer<GAsyncResult > res, Pointer<Pointer<Byte > > type, Pointer<Pointer > error) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(icon), Pointer.getPeer(res), Pointer.getPeer(type), Pointer.getPeer(error)), GInputStream.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long icon, @Ptr long res, @Ptr long type, @Ptr long error);
	};
}
