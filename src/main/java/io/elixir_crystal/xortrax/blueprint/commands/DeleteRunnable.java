package io.elixir_crystal.xortrax.blueprint.commands;

import io.elixir_crystal.xortrax.blueprint.PlugGividado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.command.CommandSender;
import redempt.redlib.misc.FormatUtils;

@AllArgsConstructor
@Getter
public class DeleteRunnable implements Runnable {

    private final PlugGividado plug;
    private final CommandSender sender;
    private final String id;

    @Override
    public void run() {
        try {
            getPlug().getCman().load();
            getSender().sendMessage(FormatUtils.color(getPlug().getPrefix() + "&fReloaded"));
        } catch (Exception e) {
            e.printStackTrace();
            getSender().sendMessage(FormatUtils.color(getPlug().getPrefix() + "&cError occurred"));
        }
    }

}
