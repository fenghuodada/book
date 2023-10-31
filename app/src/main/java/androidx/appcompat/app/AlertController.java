package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.C0157c;
import androidx.core.widget.NestedScrollView;
import com.ambrose.overwall.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class AlertController {

    /* renamed from: A */
    public TextView f149A;

    /* renamed from: B */
    public View f150B;

    /* renamed from: C */
    public ListAdapter f151C;

    /* renamed from: E */
    public final int f153E;

    /* renamed from: F */
    public final int f154F;

    /* renamed from: G */
    public final int f155G;

    /* renamed from: H */
    public final int f156H;

    /* renamed from: I */
    public final boolean f157I;

    /* renamed from: J */
    public final HandlerC0084c f158J;

    /* renamed from: a */
    public final Context f160a;

    /* renamed from: b */
    public final DialogC0147v f161b;

    /* renamed from: c */
    public final Window f162c;

    /* renamed from: d */
    public final int f163d;

    /* renamed from: e */
    public CharSequence f164e;

    /* renamed from: f */
    public RecycleListView f165f;

    /* renamed from: g */
    public View f166g;

    /* renamed from: h */
    public int f167h;

    /* renamed from: j */
    public Button f169j;

    /* renamed from: k */
    public CharSequence f170k;

    /* renamed from: l */
    public Message f171l;

    /* renamed from: m */
    public Drawable f172m;

    /* renamed from: n */
    public Button f173n;

    /* renamed from: o */
    public CharSequence f174o;

    /* renamed from: p */
    public Message f175p;

    /* renamed from: q */
    public Drawable f176q;

    /* renamed from: r */
    public Button f177r;

    /* renamed from: s */
    public CharSequence f178s;

    /* renamed from: t */
    public Message f179t;

    /* renamed from: u */
    public Drawable f180u;

    /* renamed from: v */
    public NestedScrollView f181v;

    /* renamed from: x */
    public Drawable f183x;

    /* renamed from: y */
    public ImageView f184y;

    /* renamed from: z */
    public TextView f185z;

    /* renamed from: i */
    public boolean f168i = false;

    /* renamed from: w */
    public int f182w = 0;

    /* renamed from: D */
    public int f152D = -1;

    /* renamed from: K */
    public final View$OnClickListenerC0082a f159K = new View$OnClickListenerC0082a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        public final int f186a;

        /* renamed from: b */
        public final int f187b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0157c.f429t);
            this.f187b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f186a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0082a implements View.OnClickListener {
        public View$OnClickListenerC0082a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f169j || (message2 = alertController.f171l) == null) && (view != alertController.f173n || (message2 = alertController.f175p) == null)) ? (view != alertController.f177r || (message = alertController.f179t) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            alertController.f158J.obtainMessage(1, alertController.f161b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public static class C0083b {

        /* renamed from: a */
        public final Context f189a;

        /* renamed from: b */
        public final LayoutInflater f190b;

        /* renamed from: c */
        public Drawable f191c;

        /* renamed from: d */
        public CharSequence f192d;

        /* renamed from: e */
        public View f193e;

        /* renamed from: f */
        public CharSequence f194f;

        /* renamed from: g */
        public DialogInterface.OnClickListener f195g;

        /* renamed from: h */
        public CharSequence f196h;

        /* renamed from: i */
        public DialogInterface.OnClickListener f197i;

        /* renamed from: j */
        public DialogInterface.OnKeyListener f198j;

        /* renamed from: k */
        public ListAdapter f199k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f200l;

        /* renamed from: m */
        public View f201m;

        /* renamed from: n */
        public boolean f202n;

        /* renamed from: o */
        public int f203o = -1;

        public C0083b(ContextThemeWrapper contextThemeWrapper) {
            this.f189a = contextThemeWrapper;
            this.f190b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public static final class HandlerC0084c extends Handler {

        /* renamed from: a */
        public final WeakReference<DialogInterface> f204a;

        public HandlerC0084c(DialogInterface dialogInterface) {
            this.f204a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f204a.get(), message.what);
            } else if (i != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public static class C0085d extends ArrayAdapter<CharSequence> {
        public C0085d(Context context, int i) {
            super(context, i, 16908308, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0147v dialogC0147v, Window window) {
        this.f160a = context;
        this.f161b = dialogC0147v;
        this.f162c = window;
        this.f158J = new HandlerC0084c(dialogC0147v);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0157c.f414e, R.attr.alertDialogStyle, 0);
        this.f153E = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f154F = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f155G = obtainStyledAttributes.getResourceId(7, 0);
        this.f156H = obtainStyledAttributes.getResourceId(3, 0);
        this.f157I = obtainStyledAttributes.getBoolean(6, true);
        this.f163d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogC0147v.m12931c().mo12961x(1);
    }

    /* renamed from: a */
    public static boolean m13041a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (m13041a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Nullable
    /* renamed from: b */
    public static ViewGroup m13040b(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: c */
    public final void m13039c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f158J.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f178s = charSequence;
            this.f179t = obtainMessage;
            this.f180u = null;
        } else if (i == -2) {
            this.f174o = charSequence;
            this.f175p = obtainMessage;
            this.f176q = null;
        } else if (i != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f170k = charSequence;
            this.f171l = obtainMessage;
            this.f172m = null;
        }
    }
}
