package catgirlroutes.utils.autop3.actions

import catgirlroutes.module.impl.player.HClip
import catgirlroutes.utils.autop3.Ring
import catgirlroutes.utils.customtriggers.TypeName

@TypeName("hclip")
data object HClipRing : RingAction() {
//    override val description: String = "uses hclip"
    override fun execute(ring: Ring) {
        HClip.hClip(ring.yaw)
    }
}