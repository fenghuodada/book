package com.qmuiteam.qmui.widget.textview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.C9056b;
import com.qmuiteam.qmui.alpha.C9005g;
import com.qmuiteam.qmui.link.C9069c;
import com.qmuiteam.qmui.span.InterfaceC9138c;
import java.util.HashSet;
import libv2ray.V2rayConfig;

/* loaded from: classes3.dex */
public class QMUILinkTextView extends C9005g implements InterfaceC9138c {

    /* renamed from: t */
    public static final HashSet f17961t;

    /* renamed from: u */
    public static final long f17962u;

    /* renamed from: m */
    public CharSequence f17963m;

    /* renamed from: n */
    public ColorStateList f17964n;

    /* renamed from: o */
    public final ColorStateList f17965o;

    /* renamed from: p */
    public int f17966p;

    /* renamed from: q */
    public InterfaceC9253b f17967q;

    /* renamed from: r */
    public long f17968r;

    /* renamed from: s */
    public final HandlerC9252a f17969s;

    /* renamed from: com.qmuiteam.qmui.widget.textview.QMUILinkTextView$a */
    /* loaded from: classes3.dex */
    public class HandlerC9252a extends Handler {
        public HandlerC9252a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (1000 != message.what) {
                return;
            }
            Log.d("LinkTextView", "handleMessage: " + message.obj);
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                QMUILinkTextView qMUILinkTextView = QMUILinkTextView.this;
                if (qMUILinkTextView.f17967q != null && !TextUtils.isEmpty(str)) {
                    String lowerCase = str.toLowerCase();
                    if (lowerCase.startsWith("tel:")) {
                        Uri.parse(str).getSchemeSpecificPart();
                        qMUILinkTextView.f17967q.mo2548c();
                    } else if (lowerCase.startsWith("mailto:")) {
                        Uri.parse(str).getSchemeSpecificPart();
                        qMUILinkTextView.f17967q.mo2550a();
                    } else if (lowerCase.startsWith(V2rayConfig.HTTP) || lowerCase.startsWith("https")) {
                        qMUILinkTextView.f17967q.mo2549b(str);
                    }
                }
            }
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.textview.QMUILinkTextView$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9253b {
        /* renamed from: a */
        void mo2550a();

        /* renamed from: b */
        void mo2549b(String str);

        /* renamed from: c */
        void mo2548c();
    }

    /* renamed from: com.qmuiteam.qmui.widget.textview.QMUILinkTextView$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9254c {
    }

    static {
        HashSet hashSet = new HashSet();
        f17961t = hashSet;
        hashSet.add("tel");
        hashSet.add("mailto");
        hashSet.add(V2rayConfig.HTTP);
        hashSet.add("https");
        f17962u = ViewConfiguration.getDoubleTapTimeout();
    }

    public QMUILinkTextView(Context context) {
        this(context, null);
        this.f17965o = null;
        this.f17964n = ContextCompat.m12039b(context, R.color.qmui_s_link_color);
    }

    public QMUILinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17963m = null;
        this.f17968r = 0L;
        this.f17969s = new HandlerC9252a(Looper.getMainLooper());
        this.f17966p = getAutoLinkMask() | 7;
        setAutoLinkMask(0);
        if (C9069c.f17388a == null) {
            C9069c.f17388a = new C9069c();
        }
        setMovementMethodCompat(C9069c.f17388a);
        setHighlightColor(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9056b.f17318m);
        this.f17965o = obtainStyledAttributes.getColorStateList(0);
        this.f17964n = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        CharSequence charSequence = this.f17963m;
        if (charSequence != null) {
            setText(charSequence);
        }
        setChangeAlphaWhenPress(false);
    }

    public int getAutoLinkMaskCompat() {
        return this.f17966p;
    }

    @Override // com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView, android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            HandlerC9252a handlerC9252a = this.f17969s;
            boolean hasMessages = handlerC9252a.hasMessages(1000);
            Log.w("LinkTextView", "onTouchEvent hasSingleTap: " + hasMessages);
            if (!hasMessages) {
                this.f17968r = SystemClock.uptimeMillis();
            } else {
                Log.w("LinkTextView", "onTouchEvent disallow onSpanClick mSingleTapConfirmedHandler because of DOUBLE TAP");
                handlerC9252a.removeMessages(1000);
                this.f17968r = 0L;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.qmuiteam.qmui.widget.textview.QMUISpanTouchFixTextView, android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        int selectionEnd = getSelectionEnd();
        if (selectionEnd > 0) {
            getText().subSequence(getSelectionStart(), selectionEnd).toString();
            return super.performLongClick();
        }
        return super.performLongClick();
    }

    public void setAutoLinkMaskCompat(int i) {
        this.f17966p = i;
    }

    public void setLinkColor(ColorStateList colorStateList) {
        this.f17964n = colorStateList;
    }

    public void setOnLinkClickListener(InterfaceC9253b interfaceC9253b) {
        this.f17967q = interfaceC9253b;
    }

    public void setOnLinkLongClickListener(InterfaceC9254c interfaceC9254c) {
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e7 A[SYNTHETIC] */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setText(java.lang.CharSequence r19, android.widget.TextView.BufferType r20) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.widget.textview.QMUILinkTextView.setText(java.lang.CharSequence, android.widget.TextView$BufferType):void");
    }
}
