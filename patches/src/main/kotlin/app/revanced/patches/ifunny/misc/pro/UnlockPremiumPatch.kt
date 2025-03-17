package app.revanced.patches.ifunny.misc.pro

import app.revanced.patcher.extensions.InstructionExtensions.replaceInstructions
import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val unlockProPatch = bytecodePatch(
    name = "Premium mode",
    description = "Unlocks all iFunny Premium features"
) {
    compatibleWith("mobi.ifunny")

    execute {
        checkPremiumFingerprint.method.replaceInstructions(
            0,
            """
                 const/4 v0, 0x1
                 return v0
            """,
        )
    }
}
