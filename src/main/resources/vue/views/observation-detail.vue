<template id="observation-detail">
    <div v-if="observation" class="observation-container">
        {{console.log(this.observation)}}
        <h1>{{observation.name}}</h1>
        <img v-if="observation.picUrl" class="cover-image" v-bind:src="observation.picUrl">
        <img v-else class="cover-image" src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Icon-round-Question_mark.svg/480px-Icon-round-Question_mark.svg.png">
        <! -- Her sliter jeg med å få ut all dataen til objektet fordi jeg ikke klarer å få ut veridene til klassene som er lagt i andre klasser som f.eks. {{observation.lifeform.name}} ––>
        <p> this is a picture of observation {{observation.id}} that we have decided to call {{observation.name}}. here are the following stats of the lifeform {{observation.lifeform}}.
            It was discovered at these coordinates : {{observation.location.latitude}} latitude and {{observation.location.latitude}} longitude on Planet Gargantua. The discovery team had this to say about the creature : {{observation.comment}}.</p>
        <p> </p>
            <a class="button" :href="`/api/observations/${obsName}/delete`">Delete</a>
            <a class="button" :href="`/observations/${obsName}/update`">Edit</a>
        </p>
    </div>
</template>
<script>
    Vue.component("observation-detail", {
        template: "#observation-detail",
        data: () => ({
            observation: null,
            obsName: "",
        }),
        created() {
            const observationsId = this.$javalin.pathParams["observation-id"];
            this.obsName = observationsId;

            fetch(`/api/observations/${observationsId}`)
                .then(res => res.json())
                .then(res => this.observation = res)
                .catch(() => alert("Error while fetching obs"));
        }
    });
</script>
<style>
    ul{
       color:white;
    }
    div.observation-container > p {
        max-width: 30em;
    }
    div.observation-container{
        padding-top: 10px;
        overflow: hidden;
        width: 500px;
        background-color: #000000;
        color: white;
        margin: 0 auto;
        opacity: 0.96;
        text-align: center;
        -webkit-box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.25);
        -moz-box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.25);
        box-shadow: 10px 10px 5px 0px rgba(0,0,0,0.25);
    }

    img.planet-cover-image {
        height: 320px;
        width: 320px;
        padding-bottom: 20px;
    }

    .button {
        padding: 10px;
        margin: 10px;
        border: 1px solid white;
        color: white;
        border-radius: 15px;
    }

    button a{
        color: white;
        text-decoration: none;
        font-weight: bold;
    }

    .button:hover{
        border: 2px solid white;
    }

</style>