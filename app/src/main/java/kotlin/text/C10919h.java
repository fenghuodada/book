package kotlin.text;

import kotlin.jvm.functions.InterfaceC10820l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.text.h */
/* loaded from: classes3.dex */
public class C10919h {
    /* renamed from: a */
    public static final void m402a(@NotNull StringBuilder sb, Object obj, @Nullable InterfaceC10820l interfaceC10820l) {
        CharSequence valueOf;
        if (interfaceC10820l != null) {
            obj = interfaceC10820l.invoke(obj);
        } else {
            if (!(obj == null ? true : obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                    return;
                }
                valueOf = String.valueOf(obj);
                sb.append(valueOf);
            }
        }
        valueOf = (CharSequence) obj;
        sb.append(valueOf);
    }
}
