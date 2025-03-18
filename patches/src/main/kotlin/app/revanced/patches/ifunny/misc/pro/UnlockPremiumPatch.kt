package app.revanced.patches.ifunny.misc.pro

import app.revanced.patcher.extensions.InstructionExtensions.replaceInstructions
import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val unlockProPatch = bytecodePatch(
    name = "Premium mode",
    description = "Unlocks the iFunny Premium view and Save without watermark."
) {
    compatibleWith("mobi.ifunny"("10.15.11"))

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
