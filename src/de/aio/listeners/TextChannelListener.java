package de.aio.listeners;

import de.aio.AIO;
import de.aio.commands.types.Commands;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class TextChannelListener extends ListenerAdapter
{
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent e)
	{
		if (!e.getAuthor().isBot())
		{
			Message msg = e.getMessage();
			TextChannel channel = e.getChannel();
			String cmd = msg.getContentDisplay().split(" ")[0];
			Member member = e.getMember();
			
			if (cmd.equalsIgnoreCase(Commands.SAY.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
			else if (cmd.equalsIgnoreCase(Commands.CHANNEL.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
			else if (cmd.equalsIgnoreCase(Commands.LANGUAGE.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
			else if (cmd.equalsIgnoreCase(Commands.KICK.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
			else if (cmd.equalsIgnoreCase(Commands.BAN.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
			else if (cmd.equalsIgnoreCase(Commands.PERMISSION.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
			else if (cmd.equalsIgnoreCase(Commands.WELCOME.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
			else if (cmd.equalsIgnoreCase(Commands.VERIFY.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
			else if (cmd.equalsIgnoreCase(Commands.REACTION.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
			else if (cmd.equalsIgnoreCase(Commands.MULTITWITCH.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
			else if (cmd.equalsIgnoreCase(Commands.NEWSLETTER.getCmd()))
			{
				if (!AIO.commandManager.perform(cmd, member, channel, msg))
				{
					channel.sendMessage(AIO.languageManager.getString("unknownCommand")).queue();
				}
			}
		}
	}
}
