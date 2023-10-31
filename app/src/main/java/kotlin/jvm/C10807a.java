package kotlin.jvm;

import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.InterfaceC10836c;
import kotlin.reflect.InterfaceC10885c;
import org.jetbrains.annotations.NotNull;

@JvmName(name = "JvmClassMappingKt")
/* renamed from: kotlin.jvm.a */
/* loaded from: classes3.dex */
public final class C10807a {
    @NotNull
    /* renamed from: a */
    public static final <T> Class<T> m442a(@NotNull InterfaceC10885c<T> interfaceC10885c) {
        C10843j.m430f(interfaceC10885c, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC10836c) interfaceC10885c).mo423a();
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    return !name.equals("double") ? cls : Double.class;
                case 104431:
                    return !name.equals("int") ? cls : Integer.class;
                case 3039496:
                    return !name.equals("byte") ? cls : Byte.class;
                case 3052374:
                    return !name.equals("char") ? cls : Character.class;
                case 3327612:
                    return !name.equals("long") ? cls : Long.class;
                case 3625364:
                    return !name.equals("void") ? cls : Void.class;
                case 64711720:
                    return !name.equals("boolean") ? cls : Boolean.class;
                case 97526364:
                    return !name.equals("float") ? cls : Float.class;
                case 109413500:
                    return !name.equals("short") ? cls : Short.class;
                default:
                    return cls;
            }
        }
        return cls;
    }
}
