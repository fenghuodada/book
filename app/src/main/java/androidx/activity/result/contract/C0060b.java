package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.AbstractC0058a;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C10806j;
import kotlin.collections.C10751g;
import kotlin.collections.C10753i;
import kotlin.collections.C10760p;
import kotlin.collections.C10764t;
import kotlin.collections.C10765u;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12541#2,2:960\n8676#2,2:962\n9358#2,4:964\n11365#2:968\n11700#2,3:969\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n188#1:960,2\n195#1:962,2\n195#1:964,4\n208#1:968\n208#1:969,3\n*E\n"})
/* renamed from: androidx.activity.result.contract.b */
/* loaded from: classes.dex */
public final class C0060b extends AbstractC0058a<String[], Map<String, Boolean>> {
    @Override // androidx.activity.result.contract.AbstractC0058a
    public final Intent createIntent(Context context, String[] strArr) {
        String[] input = strArr;
        C10843j.m430f(context, "context");
        C10843j.m430f(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        C10843j.m431e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.AbstractC0058a
    public final AbstractC0058a.C0059a<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
        boolean z;
        boolean z2;
        String[] input = strArr;
        C10843j.m430f(context, "context");
        C10843j.m430f(input, "input");
        boolean z3 = true;
        if (input.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new AbstractC0058a.C0059a<>(C10760p.f21364a);
        }
        int length = input.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (ContextCompat.m12040a(context, input[i]) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
                break;
            }
            i++;
        }
        if (z3) {
            int m468a = C10764t.m468a(input.length);
            if (m468a < 16) {
                m468a = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(m468a);
            for (String str : input) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new AbstractC0058a.C0059a<>(linkedHashMap);
        }
        return null;
    }

    @Override // androidx.activity.result.contract.AbstractC0058a
    public final Map<String, Boolean> parseResult(int i, Intent intent) {
        boolean z;
        C10760p c10760p = C10760p.f21364a;
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                ArrayList m491e = C10751g.m491e(stringArrayExtra);
                Iterator it = m491e.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(C10753i.m482g(m491e), C10753i.m482g(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C10806j(it.next(), it2.next()));
                }
                return C10765u.m464e(arrayList2);
            }
            return c10760p;
        }
        return c10760p;
    }
}
