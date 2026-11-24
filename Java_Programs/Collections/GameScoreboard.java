package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameScoreboard 
{
    private Map<String, PlayerModel> map = new HashMap<>();

    public Map<String, PlayerModel> getMap() {
        return map;
    }

    public void setMap(Map<String, PlayerModel> map) {
        this.map = map;
    }

    public void addPlayer(PlayerModel player)
    {
        if(!map.containsKey(player.getPlayerID()) && player!=null)
        {
            map.put(player.getPlayerID(),player);
            System.out.println("Player was added successfully!");
        }
    }

    public boolean removePlayer(String playerID)
    {
        if(map.containsKey(playerID))
        {
            map.remove(playerID);
            return true;
        }
        return false;
    }
    
    public Map<String, PlayerModel> searchPlayers(String keyword)
    {
        Map<String, PlayerModel> resultKey = new HashMap<>();

        for(Map.Entry<String, PlayerModel> entry : map.entrySet())
        {
            if(entry.getValue().getPlayerName().toLowerCase().contains(keyword.toLowerCase()))
            {
                resultKey.put(entry.getKey(), entry.getValue());
            }
        }
        return resultKey;
    }

    public PlayerModel updatePlayerScore(String playerID, int newScore)
    {
        PlayerModel pModel = map.get(playerID);
        if(pModel!=null)
        {
            pModel.setScore(newScore);
            return pModel;
        }
        return null;
    }

    public Map<String, PlayerModel> getTopScoreingPlayers()
    {
        Map<String, PlayerModel> resultTopScore = new HashMap<String,PlayerModel>();
        double topScore = Double.MIN_VALUE;
        for(Map.Entry<String, PlayerModel> entry : map.entrySet())
        {
            if(entry.getValue().getScore() > topScore)
            {
                resultTopScore.put(entry.getKey(), entry.getValue());
            }
        }
        return resultTopScore;
    }

    public Map<Integer, List<PlayerModel>> groupPlayers()
    {
        Map<Integer, List<PlayerModel>> resultGroup = new HashMap<>();

        for(Map.Entry<String, PlayerModel> entry : map.entrySet())
        {
            PlayerModel player = entry.getValue();
            int level = player.getLevel();

            if(!resultGroup.containsKey(level))
            {
                resultGroup.put(level, new ArrayList<>());
            }

            resultGroup.get(level).add(player);
        }

        return resultGroup;
    }
}
