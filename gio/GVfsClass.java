package gio;
import gio.GIOLibrary.GDestroyNotify;
import gio.GIOLibrary.GFile;
import gio.GIOLibrary.GFileAttributeMatcher;
import gio.GIOLibrary.GFileInfo;
import gio.GIOLibrary.GFileQueryInfoFlags;
import gio.GIOLibrary.GIcon;
import gio.GIOLibrary.GVariant;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
import org.bridj.util.DefaultParameterizedType;
/**
 * <i>native declaration : glib-2.0/gio/gvfs.h:49</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GVfsClass extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GObjectClass (Unsupported type) */
	/** C type : get_file_for_path_callback* */
	@Field(1) 
	public Pointer<GVfsClass.get_file_for_path_callback > get_file_for_path() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : get_file_for_path_callback* */
	@Field(1) 
	public GVfsClass get_file_for_path(Pointer<GVfsClass.get_file_for_path_callback > get_file_for_path) {
		this.io.setPointerField(this, 1, get_file_for_path);
		return this;
	}
	/** C type : get_file_for_uri_callback* */
	@Field(2) 
	public Pointer<GVfsClass.get_file_for_uri_callback > get_file_for_uri() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : get_file_for_uri_callback* */
	@Field(2) 
	public GVfsClass get_file_for_uri(Pointer<GVfsClass.get_file_for_uri_callback > get_file_for_uri) {
		this.io.setPointerField(this, 2, get_file_for_uri);
		return this;
	}
	/** C type : get_supported_uri_schemes_callback* */
	@Field(3) 
	public Pointer<GVfsClass.get_supported_uri_schemes_callback > get_supported_uri_schemes() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : get_supported_uri_schemes_callback* */
	@Field(3) 
	public GVfsClass get_supported_uri_schemes(Pointer<GVfsClass.get_supported_uri_schemes_callback > get_supported_uri_schemes) {
		this.io.setPointerField(this, 3, get_supported_uri_schemes);
		return this;
	}
	/** C type : parse_name_callback* */
	@Field(4) 
	public Pointer<GVfsClass.parse_name_callback > parse_name() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : parse_name_callback* */
	@Field(4) 
	public GVfsClass parse_name(Pointer<GVfsClass.parse_name_callback > parse_name) {
		this.io.setPointerField(this, 4, parse_name);
		return this;
	}
	/**
	 * < private ><br>
	 * C type : local_file_add_info_callback*
	 */
	@Field(5) 
	public Pointer<GVfsClass.local_file_add_info_callback > local_file_add_info() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * < private ><br>
	 * C type : local_file_add_info_callback*
	 */
	@Field(5) 
	public GVfsClass local_file_add_info(Pointer<GVfsClass.local_file_add_info_callback > local_file_add_info) {
		this.io.setPointerField(this, 5, local_file_add_info);
		return this;
	}
	/** C type : add_writable_namespaces_callback* */
	@Field(6) 
	public Pointer<GVfsClass.add_writable_namespaces_callback > add_writable_namespaces() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : add_writable_namespaces_callback* */
	@Field(6) 
	public GVfsClass add_writable_namespaces(Pointer<GVfsClass.add_writable_namespaces_callback > add_writable_namespaces) {
		this.io.setPointerField(this, 6, add_writable_namespaces);
		return this;
	}
	/** C type : local_file_removed_callback* */
	@Field(7) 
	public Pointer<GVfsClass.local_file_removed_callback > local_file_removed() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : local_file_removed_callback* */
	@Field(7) 
	public GVfsClass local_file_removed(Pointer<GVfsClass.local_file_removed_callback > local_file_removed) {
		this.io.setPointerField(this, 7, local_file_removed);
		return this;
	}
	/** C type : local_file_moved_callback* */
	@Field(8) 
	public Pointer<GVfsClass.local_file_moved_callback > local_file_moved() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : local_file_moved_callback* */
	@Field(8) 
	public GVfsClass local_file_moved(Pointer<GVfsClass.local_file_moved_callback > local_file_moved) {
		this.io.setPointerField(this, 8, local_file_moved);
		return this;
	}
	/** C type : deserialize_icon_callback* */
	@Field(9) 
	public Pointer<GVfsClass.deserialize_icon_callback > deserialize_icon() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : deserialize_icon_callback* */
	@Field(9) 
	public GVfsClass deserialize_icon(Pointer<GVfsClass.deserialize_icon_callback > deserialize_icon) {
		this.io.setPointerField(this, 9, deserialize_icon);
		return this;
	}
	/**
	 * Padding for future expansion<br>
	 * C type : _g_reserved1_callback*
	 */
	@Field(10) 
	public Pointer<GVfsClass._g_reserved1_callback > _g_reserved1() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * Padding for future expansion<br>
	 * C type : _g_reserved1_callback*
	 */
	@Field(10) 
	public GVfsClass _g_reserved1(Pointer<GVfsClass._g_reserved1_callback > _g_reserved1) {
		this.io.setPointerField(this, 10, _g_reserved1);
		return this;
	}
	/** C type : _g_reserved2_callback* */
	@Field(11) 
	public Pointer<GVfsClass._g_reserved2_callback > _g_reserved2() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : _g_reserved2_callback* */
	@Field(11) 
	public GVfsClass _g_reserved2(Pointer<GVfsClass._g_reserved2_callback > _g_reserved2) {
		this.io.setPointerField(this, 11, _g_reserved2);
		return this;
	}
	/** C type : _g_reserved3_callback* */
	@Field(12) 
	public Pointer<GVfsClass._g_reserved3_callback > _g_reserved3() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : _g_reserved3_callback* */
	@Field(12) 
	public GVfsClass _g_reserved3(Pointer<GVfsClass._g_reserved3_callback > _g_reserved3) {
		this.io.setPointerField(this, 12, _g_reserved3);
		return this;
	}
	/** C type : _g_reserved4_callback* */
	@Field(13) 
	public Pointer<GVfsClass._g_reserved4_callback > _g_reserved4() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : _g_reserved4_callback* */
	@Field(13) 
	public GVfsClass _g_reserved4(Pointer<GVfsClass._g_reserved4_callback > _g_reserved4) {
		this.io.setPointerField(this, 13, _g_reserved4);
		return this;
	}
	/** C type : _g_reserved5_callback* */
	@Field(14) 
	public Pointer<GVfsClass._g_reserved5_callback > _g_reserved5() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : _g_reserved5_callback* */
	@Field(14) 
	public GVfsClass _g_reserved5(Pointer<GVfsClass._g_reserved5_callback > _g_reserved5) {
		this.io.setPointerField(this, 14, _g_reserved5);
		return this;
	}
	/** C type : _g_reserved6_callback* */
	@Field(15) 
	public Pointer<GVfsClass._g_reserved6_callback > _g_reserved6() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : _g_reserved6_callback* */
	@Field(15) 
	public GVfsClass _g_reserved6(Pointer<GVfsClass._g_reserved6_callback > _g_reserved6) {
		this.io.setPointerField(this, 15, _g_reserved6);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gvfs.h:32</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GVfs > vfs) {
			apply(Pointer.getPeer(vfs));
		}
		public abstract void apply(@Ptr long vfs);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:33</i> */
	public static abstract class get_file_for_path_callback extends Callback<get_file_for_path_callback > {
		public final Pointer<GFile > apply(Pointer<GVfs > vfs, Pointer<Byte > path) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(vfs), Pointer.getPeer(path)), GFile.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long vfs, @Ptr long path);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:34</i> */
	public static abstract class get_file_for_uri_callback extends Callback<get_file_for_uri_callback > {
		public final Pointer<GFile > apply(Pointer<GVfs > vfs, Pointer<Byte > uri) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(vfs), Pointer.getPeer(uri)), GFile.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long vfs, @Ptr long uri);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:35</i> */
	public static abstract class get_supported_uri_schemes_callback extends Callback<get_supported_uri_schemes_callback > {
		public final Pointer<Pointer<Byte > > apply(Pointer<GVfs > vfs) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(vfs)), DefaultParameterizedType.paramType(Pointer.class, Byte.class));
		}
		@Ptr 
		public abstract long apply(@Ptr long vfs);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:36</i> */
	public static abstract class parse_name_callback extends Callback<parse_name_callback > {
		public final Pointer<GFile > apply(Pointer<GVfs > vfs, Pointer<Byte > parse_name) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(vfs), Pointer.getPeer(parse_name)), GFile.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long vfs, @Ptr long parse_name);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:37</i> */
	public static abstract class local_file_add_info_callback extends Callback<local_file_add_info_callback > {
		public final void apply(Pointer<GVfs > vfs, Pointer<Byte > filename, long device, Pointer<GFileAttributeMatcher > attribute_matcher, Pointer<GFileInfo > info, Pointer<GCancellable > cancellable, Pointer<gpointer > extra_data, Pointer<GDestroyNotify > free_extra_data) {
			apply(Pointer.getPeer(vfs), Pointer.getPeer(filename), device, Pointer.getPeer(attribute_matcher), Pointer.getPeer(info), Pointer.getPeer(cancellable), Pointer.getPeer(extra_data), Pointer.getPeer(free_extra_data));
		}
		public abstract void apply(@Ptr long vfs, @Ptr long filename, long device, @Ptr long attribute_matcher, @Ptr long info, @Ptr long cancellable, @Ptr long extra_data, @Ptr long free_extra_data);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:38</i> */
	public static abstract class add_writable_namespaces_callback extends Callback<add_writable_namespaces_callback > {
		public final void apply(Pointer<GVfs > vfs, Pointer<GFileAttributeInfoList > list) {
			apply(Pointer.getPeer(vfs), Pointer.getPeer(list));
		}
		public abstract void apply(@Ptr long vfs, @Ptr long list);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:39</i> */
	public static abstract class gboolean_callback2 extends Callback<gboolean_callback2 > {
		public final void apply(Pointer<GVfs > vfs, Pointer<Byte > filename, Pointer<GFileInfo > info, IntValuedEnum<GFileQueryInfoFlags > flags, Pointer<GCancellable > cancellable, Pointer<Pointer > error) {
			apply(Pointer.getPeer(vfs), Pointer.getPeer(filename), Pointer.getPeer(info), (int)flags.value(), Pointer.getPeer(cancellable), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long vfs, @Ptr long filename, @Ptr long info, int flags, @Ptr long cancellable, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:40</i> */
	public static abstract class local_file_removed_callback extends Callback<local_file_removed_callback > {
		public final void apply(Pointer<GVfs > vfs, Pointer<Byte > filename) {
			apply(Pointer.getPeer(vfs), Pointer.getPeer(filename));
		}
		public abstract void apply(@Ptr long vfs, @Ptr long filename);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:41</i> */
	public static abstract class local_file_moved_callback extends Callback<local_file_moved_callback > {
		public final void apply(Pointer<GVfs > vfs, Pointer<Byte > source, Pointer<Byte > dest) {
			apply(Pointer.getPeer(vfs), Pointer.getPeer(source), Pointer.getPeer(dest));
		}
		public abstract void apply(@Ptr long vfs, @Ptr long source, @Ptr long dest);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:42</i> */
	public static abstract class deserialize_icon_callback extends Callback<deserialize_icon_callback > {
		public final Pointer<GIcon > apply(Pointer<GVfs > vfs, Pointer<GVariant > value) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(vfs), Pointer.getPeer(value)), GIcon.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long vfs, @Ptr long value);
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:43</i> */
	public static abstract class _g_reserved1_callback extends Callback<_g_reserved1_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:44</i> */
	public static abstract class _g_reserved2_callback extends Callback<_g_reserved2_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:45</i> */
	public static abstract class _g_reserved3_callback extends Callback<_g_reserved3_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:46</i> */
	public static abstract class _g_reserved4_callback extends Callback<_g_reserved4_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:47</i> */
	public static abstract class _g_reserved5_callback extends Callback<_g_reserved5_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gvfs.h:48</i> */
	public static abstract class _g_reserved6_callback extends Callback<_g_reserved6_callback > {
		public abstract void apply();
	};
}
