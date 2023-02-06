package mc.daalbu.joinplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cTento příkaz mohou zadat pouze hráči!");
            return true;
        }

        Player player = (Player) sender;
        player.setHealth(20);
        player.sendMessage("§aByl jsi vyléčen!");

        return true;
    }
}
