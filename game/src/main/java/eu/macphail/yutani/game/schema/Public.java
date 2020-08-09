/*
 * This file is generated by jOOQ.
 */
package eu.macphail.yutani.game.schema;


import eu.macphail.yutani.game.schema.tables.Game;
import eu.macphail.yutani.game.schema.tables.GamePlayerList;
import eu.macphail.yutani.game.schema.tables.Player;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1248747452;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.game</code>.
     */
    public final Game GAME = Game.GAME;

    /**
     * The table <code>public.game_player_list</code>.
     */
    public final GamePlayerList GAME_PLAYER_LIST = GamePlayerList.GAME_PLAYER_LIST;

    /**
     * The table <code>public.player</code>.
     */
    public final Player PLAYER = Player.PLAYER;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Game.GAME,
            GamePlayerList.GAME_PLAYER_LIST,
            Player.PLAYER);
    }
}
