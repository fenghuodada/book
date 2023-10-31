package com.facebook.ads.redexgen.p036X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.T1 */
/* loaded from: assets/audience_network.dex */
public final class View$OnClickListenerC5650T1 extends C5366OQ implements View.OnClickListener {
    public static byte[] A0B;
    public static String[] A0C = {"idQnrwKrPQs0c3zYYHT6WTvW1aXoRMqQ", "Gekt1WHQiHnIJqxdwB9j8FzDtIJy1cfJ", "sF2V", "CdtBVDHmuEaNC9R8", "jtmNaJ8NDkAfiILRFeCM3WK", "aXO2Ks7stxeTyHMnCxwSATKtkmhK3bmt", "xmLEl9t0StR", ""};
    public static final int A0D;
    public int A00;
    public int A01;
    @Nullable
    public Bitmap A02;
    @Nullable
    public Paint A03;
    @Nullable
    public Rect A04;
    public C5953Xy A05;
    @Nullable
    public String A06;
    @Nullable
    public String A07;
    public boolean A08;
    public final C5363ON A09;
    public final Map<String, String> A0A;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A0C[2].length() != 4) {
                throw new RuntimeException();
            }
            A0C[3] = "DG";
            copyOfRange[i4] = (byte) (i5 ^ 83);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0B = new byte[]{6, 2, 77, 13, 5, 19, 19, 5, 14, 7, 5, 18};
    }

    static {
        A06();
        A0D = (int) (C5208Lr.A00 * 24.0f);
    }

    public View$OnClickListenerC5650T1(C5953Xy c5953Xy, String str, C39871K c39871k, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5269Mq interfaceC5269Mq, C5521Qw c5521Qw, C5237MK c5237mk) {
        this(c5953Xy, str, c39871k, false, interfaceC5080Jh, interfaceC5269Mq, c5521Qw, c5237mk);
    }

    public View$OnClickListenerC5650T1(C5953Xy c5953Xy, String str, C39871K c39871k, boolean z, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5269Mq interfaceC5269Mq, C5521Qw c5521Qw, C5237MK c5237mk) {
        super(c5953Xy, c39871k);
        this.A0A = new HashMap();
        this.A05 = c5953Xy;
        this.A08 = z;
        this.A09 = new C5363ON(c5953Xy, str, c5521Qw, c5237mk, interfaceC5080Jh, interfaceC5269Mq);
        setOnClickListener(this);
        C5245MS.A0G(1001, this);
    }

    @Nullable
    public static Bitmap A03(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A05() {
        String str;
        if (this.A08 && (str = this.A07) != null) {
            this.A02 = A03(C5254Mb.A03(this.A05, str.contains(A04(0, 12, 51)) ? EnumC5253Ma.MESSENGER : EnumC5253Ma.WHATSAPP));
            this.A03 = new Paint();
            int i = A0D;
            setPadding(i, 0, i, 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A06) && !TextUtils.isEmpty(this.A07)) {
                this.A09.A08(this.A06, this.A07, this.A0A);
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            this.A04 = new Rect(0, 0, bitmap.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            canvas.save();
            canvas.translate((this.A01 + this.A00) / 2, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            int width = (int) ((((getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f)) - this.A01) - this.A00);
            int i = this.A01;
            int height = (getHeight() / 2) - (i / 2);
            int top = width + i;
            Rect destRect = new Rect(width, height, top, i + height);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    public void setCta(C39881L c39881l, String str, Map<String, String> map) {
        setCta(c39881l, str, map, null);
    }

    public void setCta(C39881L c39881l, String str, Map<String, String> map, @Nullable InterfaceC5362OM interfaceC5362OM) {
        this.A06 = str;
        this.A07 = c39881l.A05();
        Map<String, String> extraData = this.A0A;
        extraData.putAll(map);
        this.A09.A07(interfaceC5362OM);
        String A04 = c39881l.A04();
        if (TextUtils.isEmpty(A04) || TextUtils.isEmpty(this.A07)) {
            setVisibility(8);
            return;
        }
        setText(A04);
        A05();
    }

    public void setIsInAppBrowser(boolean z) {
        this.A09.A09(z);
    }
}
