package com.brandon3055.draconicevolution.api.modules.properties;

import net.minecraft.util.text.ITextComponent;

import java.util.Map;

/**
 * Created by brandon3055 on 3/5/20.
 */
public interface ModuleData<D extends ModuleData<D>> {

    /**
     * All {@link ModuleData} objects are immutable.
     * This method takes another {@link ModuleData} object and returns a new {@link ModuleData}
     * that is the combination of this module and the other module.
     *
     * @param other the other data instance to combine with.
     * @return a new data object that os the combination of this and other
     */
    D combine(D other);

    /**
     * use this to supply human readable information about this data<br>
     * The map is of Property Name to Property Value
     *
     * @param map the map to which this information should be added.
     */
    void addInformation(Map<ITextComponent, ITextComponent> map);
}
