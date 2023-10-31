package com.facebook.ads.redexgen.p036X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.P5 */
/* loaded from: assets/audience_network.dex */
public class C5406P5 extends WebChromeClient {
    public static byte[] A01;
    public final /* synthetic */ C5411PA A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -44, -39, -48, -71, -32, -40, -51, -48, -35, 83, 75, 89, 89, 71, 77, 75, 68, 64, 70, 67, 52, 54, 26, 53};
    }

    public C5406P5(C5411PA c5411pa) {
        this.A00 = c5411pa;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C5088Jp c5088Jp;
        C5399Ox c5399Ox;
        C5953Xy c5953Xy;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 123), consoleMessage.message());
                jSONObject.put(A00(0, 10, 0), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 102), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            c5088Jp = this.A00.A0D;
            c5088Jp.A02(EnumC5087Jo.A0N, null);
            c5399Ox = this.A00.A0E;
            c5399Ox.A04(C44458z.A14, jSONObject2);
            c5953Xy = this.A00.A0B;
            c5953Xy.A0D().A4z(jSONObject2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
