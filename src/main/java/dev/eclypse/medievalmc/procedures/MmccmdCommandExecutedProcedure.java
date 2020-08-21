package dev.eclypse.medievalmc.procedures;

import java.util.Map;

import dev.eclypse.medievalmc.MedievalmcModElements;

@MedievalmcModElements.ModElement.Tag
public class MmccmdCommandExecutedProcedure extends MedievalmcModElements.ModElement {
	public MmccmdCommandExecutedProcedure(MedievalmcModElements instance) {
		super(instance, 24);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		System.out.println("\u00A76MedievalMC created by Jan-DT (4FA).");
	}
}
