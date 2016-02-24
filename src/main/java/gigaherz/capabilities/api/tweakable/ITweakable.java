package gigaherz.capabilities.api.tweakable;

public interface ITweakable
{
    /**
     * Requests a configuration UI or mode change.
     */
    void configure();

    /**
     * Requests the machine to dismantle itself and become and item.
     */
    void dismantle();
}
