package androidx.constraintlayout.core.widgets;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Log;
import androidx.constraintlayout.core.C0504e;
import androidx.constraintlayout.core.C0512j;
import androidx.constraintlayout.motion.widget.C0552c;
import com.ambrose.overwall.R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: androidx.constraintlayout.core.widgets.l */
/* loaded from: classes.dex */
public final class C0547l {

    /* renamed from: a */
    public static final boolean[] f1857a = new boolean[3];

    /* renamed from: b */
    public static final int[] f1858b = {R.attr.shadow_bottom, R.attr.shadow_left, R.attr.shadow_right, R.attr.shadow_top};

    /* renamed from: a */
    public static void m12207a(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            StringBuilder sb = new StringBuilder(C0552c.m12193a(str, C0552c.m12193a(glGetShaderInfoLog, 10)));
            sb.append(glGetShaderInfoLog);
            sb.append(", source: ");
            sb.append(str);
            Log.e("GlUtil", sb.toString());
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        m12206b();
    }

    /* renamed from: b */
    public static void m12206b() {
        String str;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                if (valueOf.length() != 0) {
                    str = "glError ".concat(valueOf);
                } else {
                    str = new String("glError ");
                }
                Log.e("GlUtil", str);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static void m12205c(C0541g c0541g, C0504e c0504e, C0540f c0540f) {
        c0540f.f1771p = -1;
        c0540f.f1773q = -1;
        int i = c0541g.f1736V[0];
        int[] iArr = c0540f.f1736V;
        if (i != 2 && iArr[0] == 4) {
            C0537d c0537d = c0540f.f1725K;
            int i2 = c0537d.f1703g;
            int m12240q = c0541g.m12240q();
            C0537d c0537d2 = c0540f.f1727M;
            int i3 = m12240q - c0537d2.f1703g;
            c0537d.f1705i = c0504e.m12354l(c0537d);
            c0537d2.f1705i = c0504e.m12354l(c0537d2);
            c0504e.m12362d(c0537d.f1705i, i2);
            c0504e.m12362d(c0537d2.f1705i, i3);
            c0540f.f1771p = 2;
            c0540f.f1744b0 = i2;
            int i4 = i3 - i2;
            c0540f.f1738X = i4;
            int i5 = c0540f.f1750e0;
            if (i4 < i5) {
                c0540f.f1738X = i5;
            }
        }
        if (c0541g.f1736V[1] != 2 && iArr[1] == 4) {
            C0537d c0537d3 = c0540f.f1726L;
            int i6 = c0537d3.f1703g;
            int m12244l = c0541g.m12244l();
            C0537d c0537d4 = c0540f.f1728N;
            int i7 = m12244l - c0537d4.f1703g;
            c0537d3.f1705i = c0504e.m12354l(c0537d3);
            c0537d4.f1705i = c0504e.m12354l(c0537d4);
            c0504e.m12362d(c0537d3.f1705i, i6);
            c0504e.m12362d(c0537d4.f1705i, i7);
            if (c0540f.f1748d0 > 0 || c0540f.f1760j0 == 8) {
                C0537d c0537d5 = c0540f.f1729O;
                C0512j m12354l = c0504e.m12354l(c0537d5);
                c0537d5.f1705i = m12354l;
                c0504e.m12362d(m12354l, c0540f.f1748d0 + i6);
            }
            c0540f.f1773q = 2;
            c0540f.f1746c0 = i6;
            int i8 = i7 - i6;
            c0540f.f1739Y = i8;
            int i9 = c0540f.f1752f0;
            if (i8 < i9) {
                c0540f.f1739Y = i9;
            }
        }
    }

    /* renamed from: d */
    public static int m12204d(String str, String str2) {
        String str3;
        int glCreateProgram = GLES20.glCreateProgram();
        m12206b();
        m12207a(35633, glCreateProgram, str);
        m12207a(35632, glCreateProgram, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
            if (valueOf.length() != 0) {
                str3 = "Unable to link shader program: \n".concat(valueOf);
            } else {
                str3 = new String("Unable to link shader program: \n");
            }
            Log.e("GlUtil", str3);
        }
        m12206b();
        return glCreateProgram;
    }

    /* renamed from: e */
    public static FloatBuffer m12203e(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* renamed from: f */
    public static final boolean m12202f(int i, int i2) {
        return (i & i2) == i2;
    }
}
