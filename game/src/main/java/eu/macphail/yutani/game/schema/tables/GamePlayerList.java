/*
 * This file is generated by jOOQ.
 */
package eu.macphail.yutani.game.schema.tables;


import eu.macphail.yutani.game.schema.Keys;
import eu.macphail.yutani.game.schema.Public;
import eu.macphail.yutani.game.schema.tables.records.GamePlayerListRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GamePlayerList extends TableImpl<GamePlayerListRecord> {

    private static final long serialVersionUID = 590946057;

    /**
     * The reference instance of <code>public.game_player_list</code>
     */
    public static final GamePlayerList GAME_PLAYER_LIST = new GamePlayerList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GamePlayerListRecord> getRecordType() {
        return GamePlayerListRecord.class;
    }

    /**
     * The column <code>public.game_player_list.game_id</code>.
     */
    public final TableField<GamePlayerListRecord, UUID> GAME_ID = createField(DSL.name("game_id"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.game_player_list.player_id</code>.
     */
    public final TableField<GamePlayerListRecord, String> PLAYER_ID = createField(DSL.name("player_id"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * Create a <code>public.game_player_list</code> table reference
     */
    public GamePlayerList() {
        this(DSL.name("game_player_list"), null);
    }

    /**
     * Create an aliased <code>public.game_player_list</code> table reference
     */
    public GamePlayerList(String alias) {
        this(DSL.name(alias), GAME_PLAYER_LIST);
    }

    /**
     * Create an aliased <code>public.game_player_list</code> table reference
     */
    public GamePlayerList(Name alias) {
        this(alias, GAME_PLAYER_LIST);
    }

    private GamePlayerList(Name alias, Table<GamePlayerListRecord> aliased) {
        this(alias, aliased, null);
    }

    private GamePlayerList(Name alias, Table<GamePlayerListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> GamePlayerList(Table<O> child, ForeignKey<O, GamePlayerListRecord> key) {
        super(child, key, GAME_PLAYER_LIST);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<UniqueKey<GamePlayerListRecord>> getKeys() {
        return Arrays.<UniqueKey<GamePlayerListRecord>>asList(Keys.GAME_PLAYER_LIST_UN);
    }

    @Override
    public List<ForeignKey<GamePlayerListRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GamePlayerListRecord, ?>>asList(Keys.GAME_PLAYER_LIST__GAME_PLAYER_LIST_FK, Keys.GAME_PLAYER_LIST__GAME_PLAYER_LIST_FK_1);
    }

    public Game game() {
        return new Game(this, Keys.GAME_PLAYER_LIST__GAME_PLAYER_LIST_FK);
    }

    public Player player() {
        return new Player(this, Keys.GAME_PLAYER_LIST__GAME_PLAYER_LIST_FK_1);
    }

    @Override
    public GamePlayerList as(String alias) {
        return new GamePlayerList(DSL.name(alias), this);
    }

    @Override
    public GamePlayerList as(Name alias) {
        return new GamePlayerList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GamePlayerList rename(String name) {
        return new GamePlayerList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GamePlayerList rename(Name name) {
        return new GamePlayerList(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}