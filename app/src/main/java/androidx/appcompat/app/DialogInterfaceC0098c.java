package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes.dex */
public final class DialogInterfaceC0098c extends DialogC0147v implements DialogInterface {

    /* renamed from: f */
    public final AlertController f238f;

    /* renamed from: androidx.appcompat.app.c$a */
    /* loaded from: classes.dex */
    public static class C0099a {

        /* renamed from: a */
        public final AlertController.C0083b f239a;

        /* renamed from: b */
        public final int f240b;

        public C0099a(@NonNull Context context) {
            this(context, DialogInterfaceC0098c.m13025e(context, 0));
        }

        public C0099a(@NonNull Context context, @StyleRes int i) {
            this.f239a = new AlertController.C0083b(new ContextThemeWrapper(context, DialogInterfaceC0098c.m13025e(context, i)));
            this.f240b = i;
        }

        @NonNull
        public DialogInterfaceC0098c create() {
            int i;
            AlertController.C0083b c0083b = this.f239a;
            DialogInterfaceC0098c dialogInterfaceC0098c = new DialogInterfaceC0098c(c0083b.f189a, this.f240b);
            View view = c0083b.f193e;
            AlertController alertController = dialogInterfaceC0098c.f238f;
            if (view != null) {
                alertController.f150B = view;
            } else {
                CharSequence charSequence = c0083b.f192d;
                if (charSequence != null) {
                    alertController.f164e = charSequence;
                    TextView textView = alertController.f185z;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = c0083b.f191c;
                if (drawable != null) {
                    alertController.f183x = drawable;
                    alertController.f182w = 0;
                    ImageView imageView = alertController.f184y;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f184y.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = c0083b.f194f;
            if (charSequence2 != null) {
                alertController.m13039c(-1, charSequence2, c0083b.f195g);
            }
            CharSequence charSequence3 = c0083b.f196h;
            if (charSequence3 != null) {
                alertController.m13039c(-2, charSequence3, c0083b.f197i);
            }
            if (c0083b.f199k != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) c0083b.f190b.inflate(alertController.f154F, (ViewGroup) null);
                if (c0083b.f202n) {
                    i = alertController.f155G;
                } else {
                    i = alertController.f156H;
                }
                ListAdapter listAdapter = c0083b.f199k;
                if (listAdapter == null) {
                    listAdapter = new AlertController.C0085d(c0083b.f189a, i);
                }
                alertController.f151C = listAdapter;
                alertController.f152D = c0083b.f203o;
                if (c0083b.f200l != null) {
                    recycleListView.setOnItemClickListener(new C0091b(c0083b, alertController));
                }
                if (c0083b.f202n) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f165f = recycleListView;
            }
            View view2 = c0083b.f201m;
            if (view2 != null) {
                alertController.f166g = view2;
                alertController.f167h = 0;
                alertController.f168i = false;
            }
            dialogInterfaceC0098c.setCancelable(true);
            dialogInterfaceC0098c.setCanceledOnTouchOutside(true);
            dialogInterfaceC0098c.setOnCancelListener(null);
            dialogInterfaceC0098c.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = c0083b.f198j;
            if (onKeyListener != null) {
                dialogInterfaceC0098c.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0098c;
        }

        @NonNull
        public Context getContext() {
            return this.f239a.f189a;
        }

        public C0099a setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0083b c0083b = this.f239a;
            c0083b.f196h = c0083b.f189a.getText(i);
            c0083b.f197i = onClickListener;
            return this;
        }

        public C0099a setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0083b c0083b = this.f239a;
            c0083b.f194f = c0083b.f189a.getText(i);
            c0083b.f195g = onClickListener;
            return this;
        }

        public C0099a setTitle(@Nullable CharSequence charSequence) {
            this.f239a.f192d = charSequence;
            return this;
        }

        public C0099a setView(View view) {
            this.f239a.f201m = view;
            return this;
        }
    }

    public DialogInterfaceC0098c(@NonNull Context context, @StyleRes int i) {
        super(context, m13025e(context, i));
        this.f238f = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: e */
    public static int m13025e(@NonNull Context context, @StyleRes int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0287  */
    @Override // androidx.appcompat.app.DialogC0147v, androidx.activity.DialogC0048j, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.DialogInterfaceC0098c.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.f238f.f181v;
        if (nestedScrollView != null && nestedScrollView.m11317e(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.f238f.f181v;
        if (nestedScrollView != null && nestedScrollView.m11317e(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.appcompat.app.DialogC0147v, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f238f;
        alertController.f164e = charSequence;
        TextView textView = alertController.f185z;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
