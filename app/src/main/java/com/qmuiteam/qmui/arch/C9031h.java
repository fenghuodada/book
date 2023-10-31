package com.qmuiteam.qmui.arch;

import android.content.Context;
import androidx.annotation.MainThread;
import com.qmuiteam.qmui.arch.record.C9050a;
import com.qmuiteam.qmui.arch.record.C9053d;
import com.qmuiteam.qmui.arch.record.InterfaceC9051b;
import com.qmuiteam.qmui.arch.record.RecordIdClassMap;

/* renamed from: com.qmuiteam.qmui.arch.h */
/* loaded from: classes3.dex */
public final class C9031h {

    /* renamed from: f */
    public static C9031h f17248f;

    /* renamed from: a */
    public C9050a f17249a;

    /* renamed from: b */
    public final Context f17250b;

    /* renamed from: c */
    public final RecordIdClassMap f17251c;

    /* renamed from: d */
    public final C9053d f17252d = new C9053d();

    /* renamed from: e */
    public final C9053d f17253e = new C9053d();

    /* renamed from: com.qmuiteam.qmui.arch.h$a */
    /* loaded from: classes3.dex */
    public class C9032a implements RecordIdClassMap {
        @Override // com.qmuiteam.qmui.arch.record.RecordIdClassMap
        public final int getIdByRecordClass(Class<?> cls) {
            return -1;
        }

        @Override // com.qmuiteam.qmui.arch.record.RecordIdClassMap
        public final Class<?> getRecordClassById(int i) {
            return null;
        }
    }

    public C9031h(Context context) {
        this.f17250b = context.getApplicationContext();
        try {
            this.f17251c = (RecordIdClassMap) Class.forName(RecordIdClassMap.class.getCanonicalName() + "Impl").newInstance();
        } catch (ClassNotFoundException unused) {
            this.f17251c = new C9032a();
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Can not access the Class RecordMetaMapImpl. Please file a issue to report this.");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Can not instance the Class RecordMetaMapImpl. Please file a issue to report this.");
        }
    }

    @MainThread
    /* renamed from: a */
    public static C9031h m2797a(Context context) {
        if (f17248f == null) {
            f17248f = new C9031h(context);
        }
        return f17248f;
    }

    /* renamed from: b */
    public final InterfaceC9051b m2796b() {
        if (this.f17249a == null) {
            this.f17249a = new C9050a(this.f17250b);
        }
        return this.f17249a;
    }
}
