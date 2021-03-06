package game.controllers.interfaces;

import game.models.Direction;

public interface IPlayerController {
	public void update(int delta);
	public void movePlayer(Direction dir);
}
