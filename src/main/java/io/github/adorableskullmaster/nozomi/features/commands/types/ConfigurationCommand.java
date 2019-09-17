package io.github.adorableskullmaster.nozomi.features.commands.types;

import com.jagrosh.jdautilities.command.Command;
import net.dv8tion.jda.core.Permission;

public abstract class ConfigurationCommand extends Command {
  protected ConfigurationCommand() {
    this.guildOnly = true;
    this.category = new Command.Category(
        "Configuration",
        ":x: Do not have enough permissions.",
        event -> {
          return event.getMember().hasPermission(Permission.ADMINISTRATOR) || event.isOwner();
        }
    );
  }
}