package me.cybersoul;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Wizard101 extends JavaPlugin {
	
	public HashMap<String, Wizard> wizards;
	
	public List<HashMap<String, Boolean>> booleanToSave;
	public List<HashMap<String, String>> stringToSave;
	
	public HashMap<String, Boolean> unicornWay = new HashMap<String, Boolean>();
	public HashMap<String, Boolean> petPavilion = new HashMap<String, Boolean>();
	public HashMap<String, Boolean> nightSide = new HashMap<String, Boolean>();
	public HashMap<String, Boolean> colossusBulevard = new HashMap<String, Boolean>();
	public HashMap<String, Boolean> cityStreets = new HashMap<String, Boolean>();
	
	public HashMap<String, Boolean> isInTutorial = new HashMap<String, Boolean>();
	public HashMap<String, String> genders = new HashMap<String, String>();
	
	public List<String> tutorials;
	
	public void toSave() {
		booleanToSave.add(unicornWay);
		booleanToSave.add(petPavilion);
		booleanToSave.add(nightSide);
		booleanToSave.add(colossusBulevard);
		booleanToSave.add(cityStreets);
		
		stringToSave.add(genders);
	}
	
	@Override
	public void onEnable() {
		getLogger().info("Wizard 101 Plugin has been enabled!");
		loadData();
		toSave();
		wizardMain();
		new PlayerListener(this);
	}
	
	@Override
	public void onDisable() {
		saveData();
	}
	
	public void wizardMain() {
		
		Bukkit.getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
				
				
				
			}
		}, 0, 2);
		
	}
	
	public void saveData() {
		for (String data : unicornWay.keySet()) {
			boolean value = unicornWay.get(data);
			getConfig().set("unicornWay." + data, value);
		}
		for (String data : petPavilion.keySet()) {
			boolean value = petPavilion.get(data);
			getConfig().set("petPavilion." + data, value);
		}
		saveConfig();
	}
	
	public void loadData() {unicornWay = new HashMap<String, Boolean>();
	if (getConfig().getConfigurationSection("playerId") != null) {
		Set<String> set = getConfig().getConfigurationSection("playerId").getKeys(true);
		for (String data : set) {
			boolean value = getConfig().getBoolean(data);
			unicornWay.put(data, value);
		}
	}
		unicornWay = new HashMap<String, Boolean>();
		if (getConfig().getConfigurationSection("playerId") != null) {
			Set<String> set = getConfig().getConfigurationSection("playerId").getKeys(true);
			for (String data : set) {
				boolean value = getConfig().getBoolean(data);
				unicornWay.put(data, value);
			}
		}
		petPavilion = new HashMap<String, Boolean>();
		if (getConfig().getConfigurationSection("petPavilion") != null) {
			Set<String> set = getConfig().getConfigurationSection("petPavilion").getKeys(true);
			for (String data : set) {
				boolean value = getConfig().getBoolean(data);
				petPavilion.put(data, value);
			}
		}
	}
	
	public Boolean inTutorial(Player player) {
		return isInTutorial.get(player.getName());
	}
	
	@SuppressWarnings("deprecation")
	public Tutorial addTutorial(Player player) {
		
		tutorials.add(player.getName());
		int tutInt = tutorials.size();
		int x = -321;
		int y = 51;
		int z = 446 + (57 * tutInt);
		Location tutLoc = new Location(Bukkit.getServer().getWorld("world"), x, y, z);
		x = -339;
		y = 50;
		z = 418;
		int toZ = z + (57 * tutInt);
		Location copyFromLoc = new Location(Bukkit.getServer().getWorld("world"), x, y, z);
		Location copyToLoc = new Location(Bukkit.getServer().getWorld("world"), x, y, toZ);
		Block copyFromBlock = copyFromLoc.getBlock();
		Block copyToBlock = copyToLoc.getBlock();
		player.sendMessage(ChatColor.ITALIC + "Generating Tutorial. Please Wait");
		
		for (int xChange = 1; xChange < 67; xChange++) {
			for (int yChange = 1; yChange < 29; yChange++) {
				for (int zChange = 1; zChange < 58; zChange++) {
					copyToBlock.setType(copyFromBlock.getType());
					copyToBlock.setData(copyFromBlock.getData());
					copyToLoc.setZ(toZ + zChange);
					copyFromLoc.setZ(z + zChange);
					copyToBlock = copyToLoc.getBlock();
					copyFromBlock = copyFromLoc.getBlock();
				}
				copyToLoc.setY(y + yChange);
				copyFromLoc.setY(y + yChange);
				z = 418;
				toZ = z + (57 * tutInt);
				copyToBlock = copyToLoc.getBlock();
				copyFromBlock = copyFromLoc.getBlock();
			}
			copyToLoc.setX(x + xChange);
			copyFromLoc.setX(x + xChange);
			y = 50;
			copyToBlock = copyToLoc.getBlock();
			copyFromBlock = copyFromLoc.getBlock();
		}
		
		return new Tutorial(tutLoc, tutInt);
		
	}
	
	public void removeTutorial(Player player, Location tutorial, int tutInt) {
		
		tutorials.remove(tutInt);
		
	}
	
	@SuppressWarnings("deprecation")
	public void testPerm(HashMap<String, Boolean> perm, Player player, Location gateLoc, int dir) {
		double x = gateLoc.getX();
		double y = gateLoc.getY();
		double z = gateLoc.getZ();
		World world = gateLoc.getWorld();
		Material material;
		if (perm.get(player).equals(true)) {
			material = Material.AIR;
		}
		else material = Material.IRON_FENCE;
		if (dir == 1) {
			x -= 1;
			gateLoc = new Location(world, x, y, z);
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					player.sendBlockChange(gateLoc, material, (byte) 0);
					y += 1;
					gateLoc = new Location(world, x, y, z);
				}
				x += 1;
				y -= 2;
				gateLoc = new Location(world, x, y, z);
			}
		} else {
			z -= 1;
			gateLoc = new Location(world, x, y, z);
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					player.sendBlockChange(gateLoc, material, (byte) 0);
					y += 1;
					gateLoc = new Location(world, x, y, z);
				}
				z += 1;
				y -= 2;
				gateLoc = new Location(world, x, y, z);
			}
		}
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("main") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			player.sendMessage("Hello, " + player.getName() + "!");
			player.sendMessage("The Wizard 101 plugin is currently working!");
			player.sendMessage("It is also currently running " + Bukkit.getServer().getPluginManager().getPlugin("Wizard101").getDescription().getVersion());
			
			return true;
			
		}
		
		if (cmd.getName().equalsIgnoreCase("commons") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			long cooldown = Cooldowns.getCooldown(player, "commons");
			
			if (cooldown <= 0) {
			
				Random random = new Random();
				
				int randX = random.nextInt(5 + 1 + 5) - 5;
				int randZ = random.nextInt(5 + 1 + 5) - 5;
				
				int x = -524 + randX;
				int y = 110;
				int z = 378 + randZ;
				
				player.teleport(new Location(Bukkit.getServer().getWorld("world"), x, y, z));
				
				Cooldowns.tryCooldown(player, "commons", 30000);
				
			} else {
				
				player.sendMessage(ChatColor.RED + "You must wait " + cooldown / 1000 + " seconds");
				
			}
			
			return true;
			
		}
		
		if (cmd.getName().equalsIgnoreCase("boy") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if (inTutorial(player)) {
				if (!genders.containsKey(player.getName())) {
					genders.put(player.getName(), "boy");
					player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "All right then! What's your name?");
					player.sendMessage(ChatColor.ITALIC + "Please type \"/name first [First Name]\"");
				} else {
					player.sendMessage(ChatColor.ITALIC + "You have already selected your gender.");
				}
			} else {
				player.sendMessage(ChatColor.ITALIC + "You have already selected your gender.");
			}
			
			return true;
			
		}
		
		if (cmd.getName().equalsIgnoreCase("girl") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if (inTutorial(player)) {
				if (!genders.containsKey(player.getName())) {
					genders.put(player.getName(), "girl");
					player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "Now we must consult the book of secrets and find out what school of magic is right for you.");
					player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "What is more important to you?");
					player.sendMessage("1. Show Off My Skills");
					player.sendMessage("2. Be Part Of a Winning Team");
					player.sendMessage(ChatColor.ITALIC + "Please type \"/answer 1 [1-2]\"");
				} else {
					player.sendMessage(ChatColor.ITALIC + "You have already selected your gender.");
				}
			} else {
				player.sendMessage(ChatColor.ITALIC + "You have already selected your gender.");
			}
			
			return true;
			
		}
		
		if (cmd.getName().equalsIgnoreCase("answer") && sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if (inTutorial(player)) {
				
				int balance = 0;
				int life = 0;
				int myth = 0;
				int death = 0;
				int fire = 0;
				int storm = 0;
				int ice = 0;
				
				if (args.length == 0) {
					player.sendMessage(ChatColor.ITALIC + "Please select the question");
					player.sendMessage(ChatColor.BOLD + "USAGE: " + ChatColor.RESET + "\"/answer [number] [answer]\"");
				} else if (args.length == 1) {
					player.sendMessage(ChatColor.ITALIC + "Please select an answer");
					player.sendMessage(ChatColor.BOLD + "USAGE: " + ChatColor.RESET + "\"/answer [number] [answer]\"");
				} else if (args.length > 2) {
					player.sendMessage(ChatColor.ITALIC + "Incorect usage");
					player.sendMessage(ChatColor.BOLD + "USAGE: " + ChatColor.RESET + "\"/answer [number] [answer]\"");
				} else {
					if (args[0].equalsIgnoreCase("1")) {
						if (args[1].equalsIgnoreCase("1")) {
							fire += 1;
							storm += 1;
							ice += 1;
							death += 1;
						} else if (args[1].equalsIgnoreCase("2")) {
							balance += 1;
							life += 1;
							myth += 1;
						} else {
							player.sendMessage(ChatColor.ITALIC + "Invalid answer");
							return true;
						}
						player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "Which of these is the most powerful?");
						player.sendMessage("1. Earthquake");
						player.sendMessage("2. Volcano");
						player.sendMessage("3. Blizard");
						player.sendMessage("4. Hurricane");
						player.sendMessage("5. Tornado");
						player.sendMessage("6. Plague");
						player.sendMessage("7. Sandstorm");
						player.sendMessage(ChatColor.ITALIC + "Please type \"/answer 2 [1-7]\"");
					} else if (args[0].equalsIgnoreCase("2")) {
						switch (args[1]) {
							case "1":
								life += 1;
								break;
							case "2":
								fire += 1;
								break;
							case "3":
								ice += 1;
								break;
							case "4":
								storm += 1;
								break;
							case "5":
								myth += 1;
								break;
							case "6":
								death += 1;
								break;
							case "7":
								balance += 1;
								break;
							default:
								player.sendMessage(ChatColor.ITALIC + "Invalid answer");
								return true;
						}
						player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "Which best describes you?");
						player.sendMessage("1. I am smart and I study hard");
						player.sendMessage("2. I am fast and athletic");
						player.sendMessage("3. I am a great listener");
						player.sendMessage("4. I am honest and hard-working");
						player.sendMessage("5. I am extremely creative");
						player.sendMessage("6. I am well-rounded");
						player.sendMessage(ChatColor.ITALIC + "Please type \"/answer 3 [1-6]\"");
					} else if (args[0].equalsIgnoreCase("3")) {
						switch (args[1]) {
							case "1":
								ice += 1;
								storm += 1;
								break;
							case "2":
								fire += 1;
								break;
							case "3":
								death += 1;
								break;
							case "4":
								myth += 1;
								break;
							case "5":
								life += 1;
								break;
							case "6":
								balance += 1;
								break;
							default:
								player.sendMessage(ChatColor.ITALIC + "Invalid answer");
								return true;
						}
						player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "What is your favorite season?");
						player.sendMessage("1. Summer");
						player.sendMessage("2. Winter");
						player.sendMessage("3. Spring");
						player.sendMessage("4. Fall");
						player.sendMessage(ChatColor.ITALIC + "Please type \"/answer 4 [1-4]\"");
					} else if (args[0].equalsIgnoreCase("4")) {
						switch (args[1]) {
							case "1":
								fire += 1;
								balance += 1;
								break;
							case "2":
								ice += 1;
								death += 1;
								break;
							case "3":
								life += 1;
								storm += 1;
								break;
							case "4":
								myth += 1;
								break;
							default:
								player.sendMessage(ChatColor.ITALIC + "Invalid answer");
								return true;
						}
						player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "What is more important to you?");
						player.sendMessage("1. Competeing against others");
						player.sendMessage("2. Cooperating with others");
						player.sendMessage(ChatColor.ITALIC + "Please type \"/answer 5 [1-2]\"");
					} else if (args[0].equalsIgnoreCase("5")) {
						switch (args[1]) {
							case "1":
								fire += 1;
								storm += 1;
								ice += 1;
								death += 1;
								break;
							case "2":
								balance += 1;
								myth += 1;
								life += 1;
								break;
							default:
								player.sendMessage(ChatColor.ITALIC + "Invalid answer");
								return true;
						}
						player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "What is your favorite animal?");
						player.sendMessage("1. Crab");
						player.sendMessage("2. Dragon");
						player.sendMessage("3. Unicorn");
						player.sendMessage("4. Bat");
						player.sendMessage("5. Polar Bear");
						player.sendMessage("6. Shark");
						player.sendMessage("7. Serpent");
						player.sendMessage(ChatColor.ITALIC + "Please type \"/answer 6 [1-7]\"");
					} else if (args[0].equalsIgnoreCase("6")) {
						switch (args[1]) {
							case "1":
								balance += 1;
								break;
							case "2":
								fire += 1;
								break;
							case "3":
								life += 1;unicornWay = new HashMap<String, Boolean>();
								if (getConfig().getConfigurationSection("playerId") != null) {
									Set<String> set = getConfig().getConfigurationSection("playerId").getKeys(true);
									for (String data : set) {
										boolean value = getConfig().getBoolean(data);
										unicornWay.put(data, value);
									}
								}
								break;
							case "4":
								myth += 1;
								break;
							case "5":
								ice += 1;
								break;
							case "6":
								storm += 1;
								break;
							case "7":
								death += 1;
								break;
							default:
								player.sendMessage(ChatColor.ITALIC + "Invalid answer");
								return true;
						}
						player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "What is your favorite Gem Stone?");
						player.sendMessage("1. Ruby");
						player.sendMessage("2. Sapphire");
						player.sendMessage("3. Amethyst");
						player.sendMessage("4. Peridot");
						player.sendMessage("5. Jade");
						player.sendMessage("6. Onyx");
						player.sendMessage("7. Citrine");
						player.sendMessage(ChatColor.ITALIC + "Please type \"/answer 7 [1-7]\"");
					} else if (args[0].equalsIgnoreCase("7")) {
						switch (args[1]) {
							case "1":
								fire += 1;
								break;
							case "2":
								ice += 1;
								break;
							case "3":
								storm += 1;
								break;
							case "4":
								myth += 1;
								break;
							case "5":
								life += 1;
								break;
							case "6":
								death += 1;
								break;
							case "7":
								balance += 1;
								break;
							default:
								player.sendMessage(ChatColor.ITALIC + "Invalid answer");
								return true;
						}
						player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "What is your favorite time of day?");
						player.sendMessage("1. Night");
						player.sendMessage("2. Morning");
						player.sendMessage("3. Afternoon");
						player.sendMessage(ChatColor.ITALIC + "Please type \"/answer 8 [1-3]\"");
					} else if (args[0].equalsIgnoreCase("8")) {
						switch (args[1]) {
							case "1":
								ice += 1;
								death += 1;
								break;
							case "2":
								fire += 1;
								life += 1;
								break;
							case "3":
								storm += 1;
								myth += 1;
								balance += 1;
								break;
							default:
								player.sendMessage(ChatColor.ITALIC + "Invalid answer");
								return true;
						}
						player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "What is your favorite class in school?");
						player.sendMessage("1. Science or Math");
						player.sendMessage("2. Reading and Writing");
						player.sendMessage("3. Health");
						player.sendMessage("4. Sports");
						player.sendMessage("5. I like all of my classes");
						player.sendMessage(ChatColor.ITALIC + "Please type \"/answer 9 [1-5]\"");
					} else if (args[0].equalsIgnoreCase("9")) {
						switch (args[1]) {
							case "1":
								death += 1;
								break;
							case "2":
								ice += 1;
								myth += 1;
								break;
							case "3":
								life += 1;
								break;
							case "4":
								fire += 1;
								storm += 1;
								break;
							case "5":
								balance += 1;
								break;
							default:
								player.sendMessage(ChatColor.ITALIC + "Invalid answer");
								return true;
						}
						player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "What is your favorite activity?");
						player.sendMessage("1. Learning something new");
						player.sendMessage("2. Competetive sports");
						player.sendMessage("3. Playing with my pets");
						player.sendMessage("4. Camping or fishing");
						player.sendMessage("5. Reading, playing games");
						player.sendMessage("6. I can't decide");
						player.sendMessage(ChatColor.ITALIC + "Please type \"/answer 10 [1-6]\"");
					} else if (args[0].equalsIgnoreCase("10")) {
						switch (args[1]) {
							case "1":
								myth += 1;
								break;
							case "2":
								fire += 1;
								storm += 1;
								break;
							case "3":
								life += 1;
								break;
							case "4":
								ice += 1;
								break;
							case "5":
								death += 1;
								break;
							case "6":
								balance += 1;
								break;
							default:
								player.sendMessage(ChatColor.ITALIC + "Invalid answer");
								return true;
						}
						int sort[] = new int[]{fire,ice,storm,life,myth,death,balance};
						int largest = sort[0];
						for (int i = 1; i < sort.length; i++) {
							if (sort[i] > largest) {
								largest = sort[i];
							}
						}
						if (largest == fire) {
							player.sendMessage(ChatColor.ITALIC + "You have chosen the school of " + ChatColor.RED + "FIRE");
							player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "Fire Wizards tend to be Smart, Passoinate, Competitive, and Attractive. Famous Pyromancers include Morgan Le Fay and William Shakespeare. Fire Wizards have attack spells that linger, damaging their foes again and again.");
							Wizard wizard = new Wizard(player.getName(), School.FIRE);
							wizards.put(player.getName(), wizard);
						} else if (largest == ice) {
							player.sendMessage(ChatColor.ITALIC + "You have chosen the school of " + ChatColor.BLUE + "ICE");
							player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "Ice Wizards are typically Strong, Loyal, Courageous and Honest. Famous Thaumaturges include Winston Churchill, Santa Claus, and Glenda. Ice Wizards can take a lot of damage, but are somewhat weaker when attacking.");
							Wizard wizard = new Wizard(player.getName(), School.ICE);
							wizards.put(player.getName(), wizard);
						} else if (largest == storm) {
							player.sendMessage(ChatColor.ITALIC + "You have chosen the school of " + ChatColor.LIGHT_PURPLE + "STORM");
							player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "Storm Wizards are often Impulsive, Educated, Creative and Independent. Famous Diviners include Benjamin Franklin, Lady Circe, and Galileo. Storm Wizards are capable of devastating attacks, but have somewhat weaker defenses.");
							Wizard wizard = new Wizard(player.getName(), School.STORM);
							wizards.put(player.getName(), wizard);
						} else if (largest == life) {
							player.sendMessage(ChatColor.ITALIC + "You have chosen the school of " + ChatColor.GREEN + "LIFE");
							player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "Life Wizards are often Social, Charming, Funny and Attractive. Famous Theurgists include Queen Titania, Leonardo DaVinci, and Thomas Jefferson. Life Wizards are great at healing themselves and others.");
							Wizard wizard = new Wizard(player.getName(), School.LIFE);
							wizards.put(player.getName(), wizard);
						} else if (largest == myth) {
							player.sendMessage(ChatColor.ITALIC + "You have chosen the school of " + ChatColor.YELLOW + "MYTH");
							player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "Myth Wizards are usually Visionary, Competitive, and Knowledgeable. Famous Conjurers include Socrates, Baba Yaga, and Houdini. Myth Wizards often fight alone, summoning minions to aid them in battle.");
							Wizard wizard = new Wizard(player.getName(), School.MYTH);
							wizards.put(player.getName(), wizard);
						} else if (largest == death) {
							player.sendMessage(ChatColor.ITALIC + "You have chosen the school of " + ChatColor.BLACK + "DEATH");
							player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "Death Wizards are often Solitary, Driven, Serious and Intelligent. Famous Necromancers include Dracula, Dr. Frankenstein, and Ophelia. Death Wizards use drains, taking strength from their enemies and healing themselves.");
							Wizard wizard = new Wizard(player.getName(), School.DEATH);
							wizards.put(player.getName(), wizard);
						} else if (largest == balance) {
							player.sendMessage(ChatColor.ITALIC + "You have chosen the school of " + ChatColor.GOLD + "BALANCE");
							player.sendMessage(ChatColor.BOLD + "MERLE AMBROSE: " + ChatColor.RESET + "Balance Wizards are Wise, Clever, Thoughtful and Charming. Famous Sorcerers include Cleopatra, Margaret Thatcher, and Merlin. Balance Wizards are great at adjusting the rules of combat.");
							Wizard wizard = new Wizard(player.getName(), School.BALANCE);
							wizards.put(player.getName(), wizard);
						}
						Tutorial result = addTutorial(player);
						Location tutLoc = result.getTutLocation();
						player.teleport(tutLoc);
						player.sendMessage(ChatColor.ITALIC + "Type \"/next\" to move the dialogue.");
						player.sendMessage(ChatColor.BOLD + "TUTORIAL: " + ChatColor.RESET + "Well, hello! If it isn't our newest student!");
						
					} else {
						player.sendMessage(ChatColor.ITALIC + "Invalid question number");
					}
				}
				
			}
			
		}
		
		if (cmd.getName().equalsIgnoreCase("next") && sender instanceof Player) {
			
			
			
		}
		
		return false;
		
	}
	
}
