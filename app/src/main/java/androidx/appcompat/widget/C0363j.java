package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0371k1;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.C0689a;
import com.ambrose.overwall.R;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
public final class C0363j {

    /* renamed from: b */
    public static final PorterDuff.Mode f1279b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C0363j f1280c;

    /* renamed from: a */
    public C0371k1 f1281a;

    /* renamed from: androidx.appcompat.widget.j$a */
    /* loaded from: classes.dex */
    public class C0364a implements C0371k1.InterfaceC0377f {

        /* renamed from: a */
        public final int[] f1282a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        public final int[] f1283b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        public final int[] f1284c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d */
        public final int[] f1285d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        public final int[] f1286e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f */
        public final int[] f1287f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        /* renamed from: a */
        public static boolean m12610a(int i, int[] iArr) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public static ColorStateList m12609b(@NonNull Context context, @ColorInt int i) {
            int m12499c = C0413s1.m12499c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{C0413s1.f1379b, C0413s1.f1381d, C0413s1.f1380c, C0413s1.f1383f}, new int[]{C0413s1.m12500b(context, R.attr.colorButtonNormal), C0689a.m11971b(m12499c, i), C0689a.m11971b(m12499c, i), i});
        }

        /* renamed from: d */
        public static void m12607d(Drawable drawable, int i, PorterDuff.Mode mode) {
            int[] iArr = C0427x0.f1396a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C0363j.f1279b;
            }
            mutate.setColorFilter(C0363j.m12613c(i, mode));
        }

        /* renamed from: c */
        public final ColorStateList m12608c(@NonNull Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return ContextCompat.m12039b(context, R.color.abc_tint_edittext);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return ContextCompat.m12039b(context, R.color.abc_tint_switch_track);
            }
            if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList m12498d = C0413s1.m12498d(context, R.attr.colorSwitchThumbNormal);
                if (m12498d != null && m12498d.isStateful()) {
                    int[] iArr3 = C0413s1.f1379b;
                    iArr[0] = iArr3;
                    iArr2[0] = m12498d.getColorForState(iArr3, 0);
                    iArr[1] = C0413s1.f1382e;
                    iArr2[1] = C0413s1.m12499c(context, R.attr.colorControlActivated);
                    iArr[2] = C0413s1.f1383f;
                    iArr2[2] = m12498d.getDefaultColor();
                } else {
                    iArr[0] = C0413s1.f1379b;
                    iArr2[0] = C0413s1.m12500b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = C0413s1.f1382e;
                    iArr2[1] = C0413s1.m12499c(context, R.attr.colorControlActivated);
                    iArr[2] = C0413s1.f1383f;
                    iArr2[2] = C0413s1.m12499c(context, R.attr.colorSwitchThumbNormal);
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m12609b(context, C0413s1.m12499c(context, R.attr.colorButtonNormal));
            } else {
                if (i == R.drawable.abc_btn_borderless_material) {
                    return m12609b(context, 0);
                }
                if (i == R.drawable.abc_btn_colored_material) {
                    return m12609b(context, C0413s1.m12499c(context, R.attr.colorAccent));
                }
                if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                    if (m12610a(i, this.f1283b)) {
                        return C0413s1.m12498d(context, R.attr.colorControlNormal);
                    }
                    if (m12610a(i, this.f1286e)) {
                        return ContextCompat.m12039b(context, R.color.abc_tint_default);
                    }
                    if (m12610a(i, this.f1287f)) {
                        return ContextCompat.m12039b(context, R.color.abc_tint_btn_checkable);
                    }
                    if (i == R.drawable.abc_seekbar_thumb_material) {
                        return ContextCompat.m12039b(context, R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }
                return ContextCompat.m12039b(context, R.color.abc_tint_spinner);
            }
        }
    }

    /* renamed from: a */
    public static synchronized C0363j m12615a() {
        C0363j c0363j;
        synchronized (C0363j.class) {
            if (f1280c == null) {
                m12612d();
            }
            c0363j = f1280c;
        }
        return c0363j;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m12613c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m12593h;
        synchronized (C0363j.class) {
            m12593h = C0371k1.m12593h(i, mode);
        }
        return m12593h;
    }

    /* renamed from: d */
    public static synchronized void m12612d() {
        synchronized (C0363j.class) {
            if (f1280c == null) {
                C0363j c0363j = new C0363j();
                f1280c = c0363j;
                c0363j.f1281a = C0371k1.m12597d();
                f1280c.f1281a.m12589l(new C0364a());
            }
        }
    }

    /* renamed from: e */
    public static void m12611e(Drawable drawable, C0422v1 c0422v1, int[] iArr) {
        boolean z;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = C0371k1.f1295h;
        int[] state = drawable.getState();
        int[] iArr2 = C0427x0.f1396a;
        if (drawable.mutate() == drawable) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c0422v1.f1394d;
        if (!z2 && !c0422v1.f1393c) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z2) {
                colorStateList = c0422v1.f1391a;
            } else {
                colorStateList = null;
            }
            if (c0422v1.f1393c) {
                mode = c0422v1.f1392b;
            } else {
                mode = C0371k1.f1295h;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = C0371k1.m12593h(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: b */
    public final synchronized Drawable m12614b(@NonNull Context context, @DrawableRes int i) {
        return this.f1281a.m12595f(context, i);
    }
}
