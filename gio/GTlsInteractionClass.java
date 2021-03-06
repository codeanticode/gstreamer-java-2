package gio;
import gio.GIOLibrary.GAsyncReadyCallback;
import gio.GIOLibrary.GAsyncResult;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : glib-2.0/gio/gtlsinteraction.h:24</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GTlsInteractionClass extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GObjectClass (Unsupported type) */
	/** C type : ask_password_async_callback* */
	@Field(1) 
	public Pointer<GTlsInteractionClass.ask_password_async_callback > ask_password_async() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : ask_password_async_callback* */
	@Field(1) 
	public GTlsInteractionClass ask_password_async(Pointer<GTlsInteractionClass.ask_password_async_callback > ask_password_async) {
		this.io.setPointerField(this, 1, ask_password_async);
		return this;
	}
	/**
	 * Padding for future expansion<br>
	 * C type : gpointer[24]
	 */
	@Array({24}) 
	@Field(2) 
	public Pointer<gpointer > padding() {
		return this.io.getPointerField(this, 2);
	}
	/** <i>native declaration : glib-2.0/gio/gtlsinteraction.h:21</i> */
	public static abstract class GTlsInteractionResult_callback extends Callback<GTlsInteractionResult_callback > {
		public final void apply(Pointer<GTlsInteraction > interaction, Pointer<GTlsPassword > password, Pointer<GCancellable > cancellable, Pointer<Pointer > error) {
			apply(Pointer.getPeer(interaction), Pointer.getPeer(password), Pointer.getPeer(cancellable), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long interaction, @Ptr long password, @Ptr long cancellable, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gtlsinteraction.h:22</i> */
	public static abstract class ask_password_async_callback extends Callback<ask_password_async_callback > {
		public final void apply(Pointer<GTlsInteraction > interaction, Pointer<GTlsPassword > password, Pointer<GCancellable > cancellable, Pointer<GAsyncReadyCallback > callback, gpointer user_data) {
			apply(Pointer.getPeer(interaction), Pointer.getPeer(password), Pointer.getPeer(cancellable), Pointer.getPeer(callback), user_data);
		}
		public abstract void apply(@Ptr long interaction, @Ptr long password, @Ptr long cancellable, @Ptr long callback, gpointer user_data);
	};
	/** <i>native declaration : glib-2.0/gio/gtlsinteraction.h:23</i> */
	public static abstract class GTlsInteractionResult_callback2 extends Callback<GTlsInteractionResult_callback2 > {
		public final void apply(Pointer<GTlsInteraction > interaction, Pointer<GAsyncResult > result, Pointer<Pointer > error) {
			apply(Pointer.getPeer(interaction), Pointer.getPeer(result), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long interaction, @Ptr long result, @Ptr long error);
	};
}
