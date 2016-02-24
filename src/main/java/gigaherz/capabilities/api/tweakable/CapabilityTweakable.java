package gigaherz.capabilities.api.tweakable;

import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

import java.util.concurrent.Callable;

public class CapabilityTweakable
{
    @CapabilityInject(ITweakable.class)
    public static Capability<ITweakable> TWEAKABLE_CAPABILITY = null;

    private static boolean enabled = false;

    public static void enable()
    {
        if (!enabled)
        {
            enabled = true;
            CapabilityManager.INSTANCE.register(ITweakable.class, new Storage(), new Callable<ITweakable>()
            {
                @Override
                public ITweakable call() throws Exception
                {
                    return new Implementation();
                }
            });
        }
    }

    public static class Implementation implements ITweakable
    {
        @Override
        public void configure()
        {
        }

        @Override
        public void dismantle()
        {
        }
    }

    private static class Storage
            implements Capability.IStorage<ITweakable>
    {
        @Override
        public NBTBase writeNBT(Capability<ITweakable> capability, ITweakable instance, EnumFacing side)
        {
            return null;
        }

        @Override
        public void readNBT(Capability<ITweakable> capability, ITweakable instance, EnumFacing side, NBTBase nbt)
        {
        }
    }
}