# CapabilityCore
A lightweight minecraft mod exposing useful APIs in the form of Forge Capabilities

## IEnergyHandler
An RF-like capability designed in the style of the Forge-provided IItemHandler and IFluidHandler capabilities.

## ITweakable
A wrench-oriented capability designed for simplicity, by providing `configure()`and `dismantle()` methods.

# How to Use CapabilityCore

In order to make use of a capability provided by CapabilityCore, you will need to call the static `enable()` method on the capabilities you will need, during the pre-init phase. This ensures that un-needed capabilities are not pointlessly registered.

## As a hard dependency

You can Embed the `api` packages in your own mods. Just make sure to include the full packages, as-is (without modifications nor shading). This will ensure that FML de-duplicates the packages and things keep working.

## As a soft dependency

You can build your mod with CapabilityCore as an external library, and use the `@CapabilityInject` annotation to request getting notified when the capability is present and enabled by other mods.
