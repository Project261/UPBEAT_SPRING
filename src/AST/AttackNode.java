package AST;

import Game.Game;
import Game.Direction;

import static AST.Node.*;

public class AttackNode extends ExecNode {
    private final ExprNode expression;
    private final Direction direction;

    public AttackNode(ExprNode expression, Direction direction) {
        this.expression = expression;
        this.direction = direction;
    }

    @Override
    public ExecNode execute(Game game) {
        game.attack(
                direction,
                expression.eval(game)
        );
        return next;
    }
}
