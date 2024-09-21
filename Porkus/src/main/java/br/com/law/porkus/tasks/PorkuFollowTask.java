package br.com.law.porkus.tasks;

import net.minecraft.world.entity.EntityInsentient;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftPiglin;  // Verifique o caminho correto do pacote
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class PorkuFollowTask extends BukkitRunnable {

    private final Piglin porku;
    private final Player player;

    public PorkuFollowTask(Piglin porku, Player player) {
        this.porku = porku;
        this.player = player;
    }

    @Override
    public void run() {
        if (!porku.isValid() || !player.isOnline()) {
            this.cancel();
            return;
        }

        // Obtém a versão NMS da entidade Piglin
        EntityInsentient nmsPorku = ((CraftPiglin) porku).getHandle();
        Location playerLocation = player.getLocation();

        // Mova o Piglin em direção ao jogador
        nmsPorku.getNavigation().moveTo(playerLocation.getX(), playerLocation.getY(), playerLocation.getZ(), 1.0);  // Verifique se o método correto é moveTo()
    }
}
