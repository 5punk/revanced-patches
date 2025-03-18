package app.revanced.patches.ifunny.misc.savevideos

import app.revanced.patcher.fingerprint

//public final boolean a() {
//    h hVar = h.f82197a;
//    UserInfo t12 = this.authSessionManager.f().t();
//    Intrinsics.checkNotNullExpressionValue(t12, "getUserInfo(...)");
//    if (!hVar.a(t12) || !this.paidSubscriptionCriterion.v()) {
//        UserInfo t13 = this.authSessionManager.f().t();
//        Intrinsics.checkNotNullExpressionValue(t13, "getUserInfo(...)");
//        if (!hVar.b(t13) || !this.paidSubscriptionCriterion.l()) {
//            return false;
//        }
//    }
//    return true;
//}

internal val checkSaveFingerprint = fingerprint {
    custom { method, classDef ->
        classDef.endsWith("Lc81/e;") && method.name == "a"
    }
}
