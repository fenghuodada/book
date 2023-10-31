package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.AbstractC0058a;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,959:1\n12774#2,2:960\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n228#1:960,2\n*E\n"})
/* renamed from: androidx.activity.result.contract.c */
/* loaded from: classes.dex */
public final class C0061c extends AbstractC0058a<String, Boolean> {
    @Override // androidx.activity.result.contract.AbstractC0058a
    public final Intent createIntent(Context context, String str) {
        String input = str;
        C10843j.m430f(context, "context");
        C10843j.m430f(input, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input});
        C10843j.m431e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // androidx.activity.result.contract.AbstractC0058a
    public final AbstractC0058a.C0059a<Boolean> getSynchronousResult(Context context, String str) {
        boolean z;
        String input = str;
        C10843j.m430f(context, "context");
        C10843j.m430f(input, "input");
        if (ContextCompat.m12040a(context, input) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new AbstractC0058a.C0059a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // androidx.activity.result.contract.AbstractC0058a
    public final Boolean parseResult(int i, Intent intent) {
        boolean z;
        boolean z2;
        if (intent != null && i == -1) {
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z3 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (intArrayExtra[i2] == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    z3 = true;
                }
            }
            return Boolean.valueOf(z3);
        }
        return Boolean.FALSE;
    }
}
