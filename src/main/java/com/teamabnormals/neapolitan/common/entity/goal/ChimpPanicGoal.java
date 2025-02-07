package com.teamabnormals.neapolitan.common.entity.goal;

import com.teamabnormals.neapolitan.common.entity.animal.ChimpanzeeEntity;
import net.minecraft.world.entity.ai.goal.PanicGoal;

public class ChimpPanicGoal extends PanicGoal {
	private final ChimpanzeeEntity chimpanzee;

	public ChimpPanicGoal(ChimpanzeeEntity chimpanzeeIn, double speed) {
		super(chimpanzeeIn, speed);
		this.chimpanzee = chimpanzeeIn;
	}

	public boolean canUse() {
		return (this.chimpanzee.isBaby() || this.chimpanzee.isOnFire()) && super.canUse();
	}
}
