# librarymanagement
/*
* TT-Hunter,
* -- hunts a TLS appointment.
* @version: 6.1
* @author:
* https://www.termin-tracker-all.com
*/



const centerInfo= {
  'TlsGermanyRabat_FamilyVisit': {
    'code': 'maRBA2de',
    'country': 'de',
    'aptType': 'court_sejour',
    'issueCountry': 'ma',
    'title': 'TLS Allemagne à Rabat',
    'prefix': ''
  },
  'TlsGermanyRabat_Tourism': {
    'code': 'maRBA2de',
    'country': 'de',
    'aptType': 'tourism',
    'issueCountry': 'ma',
    'title': 'TLS Allemagne à Rabat',
    'prefix': ''
  },
  'TlsGermanyRabat_BlueCard': {
    'code': 'maRBA2de',
    'country': 'de',
    'aptType': 'Public_other',
    'issueCountry': 'ma',
    'title': 'TLS Allemagne à Rabat',
    'prefix': ''
  },
  'TlsFranceFes_Case1': {
    'code': 'maFEZ2fr',
    'country': 'fr',
    'aptType': 'Primo',
    'issueCountry': 'ma',
    'title': 'TLS France à Fès',
    'prefix': ''
  },
  'TlsFranceFes_Case2': {
    'code': 'maFEZ2fr',
    'country': 'fr',
    'aptType': 'Renouvellement',
    'issueCountry': 'ma',
    'title': 'TLS France à Fès',
    'prefix': ''
  },
  'TlsFranceFes_Case3': {
    'code': 'maFEZ2fr',
    'country': 'fr',
    'aptType': 'Circulation',
    'issueCountry': 'ma',
    'title': 'TLS France à Fès',
    'prefix': ''
  },
  'TlsFranceFes_AscendantFrancais': {
    'code': 'maFEZ2fr',
    'country': 'fr',
    'aptType': 'Ascendant%20de%20Francais%20CS',
    'issueCountry': 'ma',
    'title': 'TLS France à Fès',
    'prefix': ''
  },
  'TlsFranceOujda_Case1': {
    'code': 'maOUD2fr',
    'country': 'fr',
    'aptType': 'Primo',
    'issueCountry': 'ma',
    'title': 'TLS France à Oujda',
    'prefix': ''
  },
  'TlsFranceOujda_Case2': {
    'code': 'maOUD2fr',
    'country': 'fr',
    'aptType': 'Renouvellement',
    'issueCountry': 'ma',
    'title': 'TLS France à Oujda',
    'prefix': ''
  },
  'TlsFranceOujda_Case3': {
    'code': 'maOUD2fr',
    'country': 'fr',
    'aptType': 'Circulation',
    'issueCountry': 'ma',
    'title': 'TLS France à Oujda',
    'prefix': ''
  },
  'TlsFranceOujda_AscendantFrancais': {
    'code': 'maOUD2fr',
    'country': 'fr',
    'aptType': 'Ascendant%20de%20Francais%20CS',
    'issueCountry': 'ma',
    'title': 'TLS France à Oujda',
    'prefix': ''
  },
  'TlsFranceCasablanca_Case1': {
    'code': 'maCAS2fr',
    'country': 'fr',
    'aptType': 'Grand%20Public%20PRIMO',
    'issueCountry': 'ma',
    'title': 'TLS France à Casablanca',
    'prefix': ''
  },
  'TlsFranceCasablanca_Case2': {
    'code': 'maCAS2fr',
    'country': 'fr',
    'aptType': 'Grand%20Public%20VISE',
    'issueCountry': 'ma',
    'title': 'TLS France à Casablanca',
    'prefix': ''
  },
  'TlsFranceCasablanca_Case3': {
    'code': 'maCAS2fr',
    'country': 'fr',
    'aptType': 'Grand%20Public%20CIRCULATION',
    'issueCountry': 'ma',
    'title': 'TLS France à Casablanca',
    'prefix': ''
  },
  'TlsFranceCasablanca_AscendantFrancais': {
    'code': 'maCAS2fr',
    'country': 'fr',
    'aptType': 'Ascendant%20de%20Francais%20CS',
    'issueCountry': 'ma',
    'title': 'TLS France à Casablanca',
    'prefix': ''
  },
  'TlsFranceTanger_Case1': {
    'code': 'maTNG2fr',
    'country': 'fr',
    'aptType': 'PRIMO',
    'issueCountry': 'ma',
    'title': 'TLS France à Tanger',
    'prefix': ''
  },
  'TlsFranceTanger_Case2': {
    'code': 'maTNG2fr',
    'country': 'fr',
    'aptType': 'Renouvellement',
    'issueCountry': 'ma',
    'title': 'TLS France à Tanger',
    'prefix': ''
  },
  'TlsFranceTanger_Case3': {
    'code': 'maTNG2fr',
    'country': 'fr',
    'aptType': 'Circulation',
    'issueCountry': 'ma',
    'title': 'TLS France à Tanger',
    'prefix': ''
  },
  'TlsFranceTanger_AscendantFrancais': {
    'code': 'maTNG2fr',
    'country': 'fr',
    'aptType': 'Ascendant%20FR',
    'issueCountry': 'ma',
    'title': 'TLS France à Tanger',
    'prefix': ''
  },
  'TlsFranceAgadir_Case1': {
    'code': 'maAGA2fr',
    'country': 'fr',
    'aptType': 'Grand%20Public%20PRIMO',
    'issueCountry': 'ma',
    'title': 'TLS France à Agadir',
    'prefix': ''
  },
  'TlsFranceAgadir_Case2': {
    'code': 'maAGA2fr',
    'country': 'fr',
    'aptType': 'Grand%20Public%20VISE',
    'issueCountry': 'ma',
    'title': 'TLS France à Agadir',
    'prefix': ''
  },
  'TlsFranceAgadir_Case3': {
    'code': 'maAGA2fr',
    'country': 'fr',
    'aptType': 'Grand%20Public%20CIRCULATION',
    'issueCountry': 'ma',
    'title': 'TLS France à Agadir',
    'prefix': ''
  },
  'TlsFranceAgadir_AscendantFrancais': {
    'code': 'maAGA2fr',
    'country': 'fr',
    'aptType': 'Ascendant%20de%20Francais%20CS',
    'issueCountry': 'ma',
    'title': 'TLS France à Agadir',
    'prefix': ''
  },
  'TlsFranceMarrakech_Case1': {
    'code': 'maRAK2fr',
    'country': 'fr',
    'aptType': 'normal',
    'issueCountry': 'ma',
    'title': 'TLS France à Marrakech',
    'prefix': ''
  },
  'TlsFranceMarrakech_Case2': {
    'code': 'maRAK2fr',
    'country': 'fr',
    'aptType': 'Grand%20Public%20VISE',
    'issueCountry': 'ma',
    'title': 'TLS France à Marrakech',
    'prefix': ''
  },
  'TlsFranceMarrakech_Case3': {
    'code': 'maRAK2fr',
    'country': 'fr',
    'aptType': 'Grand%20Public%20CIRCULATION',
    'issueCountry': 'ma',
    'title': 'TLS France à Marrakech',
    'prefix': ''
  },
  'TlsFranceMarrakech_AscendantFrancais': {
    'code': 'maRAK2fr',
    'country': 'fr',
    'aptType': 'Ascendant%20de%20Francais%20CS',
    'issueCountry': 'ma',
    'title': 'TLS France à Marrakech',
    'prefix': ''
  },
  'TlsFranceRabat_Case1': {
    'code': 'maRBA2fr',
    'country': 'fr',
    'aptType': 'Primo',
    'issueCountry': 'ma',
    'title': 'TLS France à Rabat',
    'prefix': ''
  },
  'TlsFranceRabat_Case2': {
    'code': 'maRBA2fr',
    'country': 'fr',
    'aptType': 'Renouvellement',
    'issueCountry': 'ma',
    'title': 'TLS France à Rabat',
    'prefix': ''
  },
  'TlsFranceRabat_Case3': {
    'code': 'maRBA2fr',
    'country': 'fr',
    'aptType': 'Circulation',
    'issueCountry': 'ma',
    'title': 'TLS France à Rabat',
    'prefix': ''
  },
  'TlsFranceRabat_AscendantFrancais': {
    'code': 'maRBA2fr',
    'country': 'fr',
    'aptType': 'Ascendant%20de%20Francais%20CS',
    'issueCountry': 'ma',
    'title': 'TLS France à Rabat',
    'prefix': ''
  },
  'TlsFranceRabat_StudentLongTerm': {
    'code': 'maRBA2fr',
    'country': 'fr',
    'aptType': 'long%20sejour%20etudiant',
    'issueCountry': 'ma',
    'title': 'TLS France à Rabat',
    'prefix': ''
  },
  'TlsFranceAnnaba_Case1': {
    'code': 'dzAAE2fr',
    'country': 'fr',
    'aptType': 'premiere_demande',
    'issueCountry': 'dz',
    'title': 'TLS France à Annaba',
    'prefix': ''
  },
  'TlsFranceAnnaba_Case2': {
    'code': 'dzAAE2fr',
    'country': 'fr',
    'aptType': 'Frequent',
    'issueCountry': 'dz',
    'title': 'TLS France à Annaba',
    'prefix': ''
  },
  'TlsFranceAnnaba_Case3': {
    'code': 'dzAAE2fr',
    'country': 'fr',
    'aptType': 'Circulation',
    'issueCountry': 'dz',
    'title': 'TLS France à Annaba',
    'prefix': ''
  },
};

let inj_html = `
    <div id="textHunterTitle">TerminTracker| Hunter <span class="version-text">v6.1</span></div>
    <div id="ttHunterDiv">
    <form id="ttHunterForm">
        <select id="itemHunterList" name="centHunterList">
            <option value="TlsFranceCasablanca_Case1">TLS France à Casablanca (cas 1)/MA</option>
            <option value="TlsFranceCasablanca_Case2">TLS France à Casablanca (cas 2)/MA</option>
            <option value="TlsFranceCasablanca_Case3">TLS France à Casablanca (cas 3)/MA</option>
            <option value="TlsFranceCasablanca_AscendantFrancais">TLS France à Casablanca (ascendant français)/MA</option>
            <option value="TlsFranceRabat_Case1">TLS France à Rabat (cas 1)/MA</option>
            <option value="TlsFranceRabat_Case2">TLS France à Rabat (cas 2)/MA</option>
            <option value="TlsFranceRabat_Case3">TLS France à Rabat (cas 3)/MA</option>
            <option value="TlsFranceRabat_AscendantFrancais">TLS France à Rabat (ascendant français)/MA</option>
            <option value="TlsFranceRabat_StudentLongTerm">TLS France à Rabat (étudiant long séjour)/MA</option>
            <option value="TlsFranceFes_Case1">TLS France à Fès (cas 1)/MA</option>
            <option value="TlsFranceFes_Case2">TLS France à Fès (cas 2)/MA</option>
            <option value="TlsFranceFes_Case3">TLS France à Fès (cas 3)/MA</option>
            <option value="TlsFranceFes_AscendantFrancais">TLS France à Fès (ascendant français)/MA</option>
            <option value="TlsFranceOujda_Case1">TLS France à Oujda (cas 1)/MA</option>
            <option value="TlsFranceOujda_Case2">TLS France à Oujda (cas 2)/MA</option>
            <option value="TlsFranceOujda_Case3">TLS France à Oujda (cas 3)/MA</option>
            <option value="TlsFranceOujda_AscendantFrancais">TLS France à Oujda (ascendant français)/MA</option>
            <option value="TlsFranceTanger_Case1">TLS France à Tanger (cas 1)/MA</option>
            <option value="TlsFranceTanger_Case2">TLS France à Tanger (cas 2)/MA</option>
            <option value="TlsFranceTanger_Case3">TLS France à Tanger (cas 3)/MA</option>
            <option value="TlsFranceTanger_AscendantFrancais">TLS France à Tanger (ascendant français)/MA</option>
            <option value="TlsFranceAgadir_Case1">TLS France à Agadir (cas 1)/MA</option>
            <option value="TlsFranceAgadir_Case2">TLS France à Agadir (cas 2)/MA</option>
            <option value="TlsFranceAgadir_Case3">TLS France à Agadir (cas 3)/MA</option>
            <option value="TlsFranceAgadir_AscendantFrancais">TLS France à Agadir (ascendant français)/MA</option>
            <option value="TlsFranceMarrakech_Case1">TLS France à Marrakech (cas 1)/MA</option>
            <option value="TlsFranceMarrakech_Case2">TLS France à Marrakech (cas 2)/MA</option>
            <option value="TlsFranceMarrakech_Case3">TLS France à Marrakech (cas 3)/MA</option>
            <option value="TlsFranceMarrakech_AscendantFrancais">TLS France à Marrakech (ascendant français)/MA</option>
            <option value="TlsGermanyRabat_Tourism">TLS Allemagne (tourisme) à Rabat/MA</option>
            <option value="TlsGermanyRabat_FamilyVisit">TLS Allemagne (visite familiale) à Rabat/MA</option>
            <option value="TlsGermanyRabat_BlueCard">TLS Allemagne (carte bleue) à Rabat/MA</option>
            <option value="TlsFranceAnnaba_Case1">TLS France à Annaba (1ère demande)/DZ</option>
            <option value="TlsFranceAnnaba_Case2">TLS France à Annaba (renouvellement ordinaire)/DZ</option>
            <option value="TlsFranceAnnaba_Case3">TLS France à Annaba (renouvellement circulation)/DZ</option>
        </select>
        <br>
        <button id="detectButton">Détecter le centre</button>
        <br><br>
        <button id="selectHunterButton">Prendre un Rendez-Vous</button>
        <br><br>

        <div class="tab-buttons">
            <button class="tab-button" data-tab="searchOptions">Options de recherche</button>
            <button class="tab-button" data-tab="reservationOptions">Options de réservation</button>
        </div>

        <div id="searchOptions" class="tab-content-a">
            <label for="refreshHunterTime">Chercher chaque (secondes) :</label>
            <input type="number" id="refreshHunterTime" name="refreshHunterTime" value="900" required>
            <br>
            
            <label for="searchConnections">Nombre des recherches simultanées :</label>
            <input type="number" id="searchConnections" name="searchConnections" value="1" required>
            <br>

            <label for="searchConnectionsPostTrigger">Nombre des recherches simultanées lors TT-Signal :</label>
            <input type="number" id="searchConnectionsPostTrigger" name="searchConnectionsPostTrigger" value="2" required>
            <br>

            <label for="keepAccountAlive">Laisser la session vivante (chaque 60s) :</label>
            <input type="checkbox" id="keepAccountAlive" name="keepAccountAlive" checked>
            <br>

            <label for="considerPrime">Considérer les créneaux Prime :</label>
            <input type="checkbox" id="considerPrime" name="considerPrime">
            <br>

            <label for="refreshPageTimeout">Rafraîchir la page chaque (minutes) :</label>
            <input type="number" id="refreshPageTimeout" name="refreshPageTimeout" value="40" required>
        </div>

        <div id="reservationOptions" class="tab-content-b"">
            <label for="parallelConnections">Nombre des connexions simultanées :</label>
            <input type="number" id="parallelConnections" name="parallelConnections" value="3" required>
            <br>
            
            <label for="offsetConnections">Décalage des connexions simultanées (secondes) :</label>
            <input type="number" id="offsetConnections" name="offsetConnections" step="any" value="0" required>
            <br>
            
            <label for="useRecaptchaSolver">Utiliser le solveur reCAPTCHA :</label>
            <input type="checkbox" id="useRecaptchaSolver" name="useRecaptchaSolver">
        </div>

        <br>
        <button id="testButton">Tester reCAPTCHA</button>
        <br><br>
        <div id="textHunterContainer">
            <div id="statusT">Statut : </div>
            <div id="messageZone">Prêt.</div>
        </div>
        <div id="textConnectionContainer">
            <div id="statusT">Connexion : </div>
            <div id="messageConnZone">?</div>
        </div>
    </form>
    </div>
    <div id="customAlert" class="alert-overlay">
      <div class="alert-box">
        <div class="alert-header">
          <h2>TT-Hunter</h2>
        </div>
        <div class="alert-body">
          <p>Pour utiliser le solveur reCAPTCHA, il faut configurer une clé (capsolver/2captcha) dans TT-Falcon.</p>
        </div>
        <div class="alert-footer">
          <button id="closeAlertButton">OK</button>
        </div>
      </div>
    </div>
    <br>
    <div id="linkHunter"><a href="https://www.termin-tracker-all.com" target="_blank">www.termin-tracker-all.com</a></div>
`;


let inj_css = `
    #messageZone {
        text-align: center;
        font-weight: bold;
        font-size: 16px;
        color: #0099cc;
        display: inline-block;
    }

    #messageConnZone {
        text-align: center;
        font-weight: bold;
        font-size: 16px;
        color: #0099cc;
        display: inline-block;
    }

    #statusT {
        text-align: center;
        font-weight: bold;
        font-size: 16px;
        color: #336699;
        display: inline-block;
    }

    label {
        font-size: 16px;
        color: #000000;
    }

    #textHunterContainer {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-direction: column;
    }

    #textConnectionContainer {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-direction: column;
    }

    #textHunterTitle {
        color: #336699;
        margin-top: 10px;
        font-size: 22px;
        text-align: center;
        font-weight: bold;
    }

    #linkHunter {
        color: #007bff;
        text-decoration: none;
        transition: color 0.3s ease;
        font-size: 13px;
        text-align: center;
    }
    
    #linkHunter:hover {
        color: #0056b3;
        text-decoration: underline;
        font-size: 13px;
        text-align: center;
    }

    button {
        background-color: #336699;
        color: #fff;
        padding: 10px 20px;
        font-size: 16px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }

    #testButton {
        background-color: #009999;
        font-size: 0.8em;
        padding: 5px 10px;
        float: right;
    }

    #detectButton {
        background-color: #339933;
        font-size: 0.8em;
        padding: 5px 10px;
        float: right;
    }

    button:hover {
        background-color: #214c7d;
    }

    #testButton:hover {
        background-color: #006666;
    }

    #detectButton:hover {
        background-color: #006600;
    }

    select {
        padding: 10px;
        font-size: 16px;
        border: none;
        background-color: #fff;
        border-radius: 5px;
        margin: 5px;
    }

    #ttHunterDiv {
        text-align: center;
    }

    .tab-buttons {
        display: flex;
        justify-content: center;
        margin-bottom: 0px;
        margin: 0;
        padding: 0;
    }

    .tab-button {
        background-color: #f1f1f1;
        color: black;
        border: 1px solid #ccc;
        padding: 5px 10px;
        margin: 0;
        cursor: pointer;
        border-radius: 5px 5px 0 0;
        font-size: 12px;
        transition: background-color 0.3s ease;
    }

    .tab-button:hover {
        background-color: #ddd;
    }

    .tab-button.active {
        background-color: #a6a6a3;
        color: black;
        border-color: #a6a6a3;
    }

    .alert-overlay {
        display: none;
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background-color: rgba(0, 0, 0, 0.5);
        justify-content: center;
        align-items: center;
        z-index: 9999;
        padding: 20px;
    }

    .alert-box {
        background-color: white;
        border-radius: 10px;
        padding: 20px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        max-width: 400px;
        width: 100%;
        text-align: center;
        animation: fadeIn 0.3s ease-out;
    }

    .alert-header {
        font-size: 18px;
        color: #336699;
        font-weight: bold;
        padding-top: 0px;
    }

    .alert-body {
        font-size: 16px;
        color: #333;
        margin: 20px 0;
    }

    .alert-footer {
        text-align: center;
    }

    .alert-footer button {
        background-color: #336699;
        color: white;
        border: none;
        padding: 10px 20px;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s ease;
    }

    .alert-footer button:hover {
        background-color: #214c7d;
    }

    @keyframes fadeIn {
      0% {
        opacity: 0;
        transform: translateY(-20px);
      }
      100% {
        opacity: 1; 
        transform: translateY(0);
      }
    }

    .tab-content-a {
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        margin-top: 0px;
        display: none;
    }
    
    .tab-content-b {
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        margin-top: 0px;
        display: none;
    }

    .tab-content-a.active {
        display: block;
    }

    .tab-content-b.active {
        display: block;
    }

    .version-text {
        font-size: 14px;
    }
`;


var timer_interval_id = undefined;
var alive_timer_interval_id = undefined;
var hard_refresh_timer_interval_id = undefined;
var is_booking_successful = false;
var is_operation_in_progress = false;
var is_tt_signal_operation_in_progress = false;
var operation_flag_interval_id = undefined;
var tt_signal_operation_flag_interval_id = undefined;
var current_motif = '';


function open_TT_Tab(evt, tabName) {
    evt.preventDefault();

    document.getElementById('searchOptions').classList.remove('active');
    document.getElementById('reservationOptions').classList.remove('active');

    const tabButtons = document.querySelectorAll('.tab-button');
    tabButtons.forEach(button => button.classList.remove('active'));

    document.getElementById(tabName).classList.add('active');
    evt.currentTarget.classList.add('active');
}

function closeAlert() {
    document.getElementById('customAlert').style.display = 'none';
}

function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}


function get_active_center() {
    var selectedCenter = localStorage.getItem('selectedCenter');
    if (!selectedCenter) {
        let hunterItemList = document.getElementById('itemHunterList');
        if (hunterItemList) {
            selectedCenter = hunterItemList.value;
            localStorage.setItem('selectedCenter', selectedCenter);
        }
    }
    return selectedCenter;
}


function click_popups() {
    const confirmButtons = document.querySelectorAll('button[data-tls-value="confirm"]');

    confirmButtons.forEach(button => {
        button.click();
    });
}


async function alive_checker() {
    console.log('TT-Hunter alive.');

    var falconCmd = localStorage.getItem('falcHunterTrigger');
    if (falconCmd) {
        if (falconCmd == 'REFRESH') {
            localStorage.setItem('falcHunterTrigger', 'NO_CMD');
            await keep_session_alive();
        }
    }

    click_popups();
}


async function tt_signal_checker() {
    var falconCmd = localStorage.getItem('falcHunterTrigger');
    if (falconCmd) {
        if (falconCmd.includes('TT-SIGNAL')) {
            console.log('falconCmd: ', falconCmd);
            var selectedSessionCenter = get_active_center();
            if (selectedSessionCenter) {
                if (falconCmd.includes('TT-SIGNAL::'+selectedSessionCenter)) {
                    if (!is_tt_signal_operation_in_progress) {
                        is_tt_signal_operation_in_progress = true;
                        if (tt_signal_operation_flag_interval_id) {
                            clearInterval(tt_signal_operation_flag_interval_id);
                        }
                        tt_signal_operation_flag_interval_id = setInterval(reset_tt_signal_flag, 1000);
                        await tt_signal_trigger();
                    }
                }
            }
            localStorage.setItem('falcHunterTrigger', 'NO_CMD');
        }
    }
}


window.addEventListener('signalEventListener', async function (event) {
    console.log('TT-Signal -> signalEventListener()');
    if (!is_tt_signal_operation_in_progress) {
        is_tt_signal_operation_in_progress = true;
        if (tt_signal_operation_flag_interval_id) {
            clearInterval(tt_signal_operation_flag_interval_id);
        }
        tt_signal_operation_flag_interval_id = setInterval(reset_tt_signal_flag, 1000);
        await tt_signal_trigger();
    }
});


function reset_operation_flag() {
    is_operation_in_progress = false;
}
function reset_tt_signal_flag() {
    is_tt_signal_operation_in_progress = false;
}


async function keep_session_alive() {
    console.log('TT-Hunter periodic check.');
    
    if ( (!is_booking_successful)&&(!is_operation_in_progress) ) {
        var selectedSessionCenter = get_active_center();
        if (selectedSessionCenter) {
            await runExtension(true, '');
        }
    }
}


async function keep_alive_by_accnt_info() {
    console.log('TT-Hunter keep alive.');

    if ( (!is_booking_successful)&&(!is_operation_in_progress) ) {
        await runKeepAlive();
    }
}


async function hard_refresh() {
    location.reload();
}


async function tt_signal_trigger() {
    console.log('Received a trigger from TT-Signal.');
    
    if ( (!is_booking_successful)&&(!is_operation_in_progress) ) {
        await runExtension(true, 'TT-SIGNAL');
    }
}


let hunter_form = document.getElementById("ttHunterForm");
if (hunter_form) {
    console.log('TT-Hunter already running.');
} else {
    let new_div = document.createElement('div');
    new_div.innerHTML = inj_html;
    document.body.prepend(new_div);

    let styleElement = document.createElement('style');
    styleElement.innerHTML = inj_css;
    document.head.prepend(styleElement);

    setInterval(alive_checker, 5000);
    setInterval(tt_signal_checker, 200);
    timer_interval_id = setInterval(keep_session_alive, 1800*1000);
    alive_timer_interval_id = setInterval(keep_alive_by_accnt_info, 60*1000);
    hard_refresh_timer_interval_id = setInterval(hard_refresh, 15*60*1000);

    handleGUI();
}


async function poll_recaptcha_solutions_from_falcon(i_nb_tasks, i_site_key, i_url) {
    let sepa = '||FalconSePa||';
    localStorage.setItem('falcRecaptchaResponse', 'EMPTY');
    localStorage.setItem('falcRecaptchaRequest', 'reCAPTCHA'+sepa+i_nb_tasks.toString()+sepa+i_site_key+sepa+i_url);
    var recapResponse = 'EMPTY';
    while (recapResponse == 'EMPTY') {
        recapResponse = localStorage.getItem('falcRecaptchaResponse');
        await sleep(100);
    }
    return recapResponse;
}


async function parallel_booking_task(selectedCenter, chosenDate, chosenTime, captchaId, groupId, xsrfToken, startTimestamp, i_recapToken, i_start_ts, i_upd_apt_type) {
    let aptType = i_upd_apt_type;
    let countryCode = centerInfo[selectedCenter]['country'];
    let pathPrefix = centerInfo[selectedCenter]['prefix'];
    let centerCode = centerInfo[selectedCenter]['code'];
    let issueCntry = centerInfo[selectedCenter]['issueCountry'];
    let skuString = 'PRIME-TIME-APPOINTMENT'; // todo: .

    if (aptType == 'prime%20time') {
        skuString = 'PRIME-TIME-APPOINTMENT';
    }

    let recaptchaToken = '';
    if (i_recapToken == 'NONE') {
        try {
            await grecaptcha.execute(captchaId, {action: 'book'}).then(function(token) {
                        recaptchaToken = token;
                    });
        } catch (error) {
            console.log('reCAPTCHA error :', error);
            return 'Créneau [' + chosenDate + ' @ ' + chosenTime + ']: ' + 'Erreur durant la requête: reCAPTCHA error.' + ' | @ ' + i_start_ts;
        }
    } else {
        if (i_recapToken.startsWith('ERROR:')) {
            capErr = i_recapToken.split('ERROR:')[1];
            console.log('reCAPTCHA error :', capErr);
            return 'Créneau [' + chosenDate + ' @ ' + chosenTime + ']: ' + 'Erreur durant la requête. reCAPTCHA error: ' + capErr + ' | @ ' + i_start_ts;
        } else {
            recaptchaToken = i_recapToken;
        }
    }

    if (recaptchaToken == '') {
        return 'Créneau [' + chosenDate + ' @ ' + chosenTime + ']: ' + 'Erreur durant la requête: reCAPTCHA not calculated.' + ' | @ ' + i_start_ts;
    }

    let apiPOSTUrl = 'https://' + pathPrefix + countryCode + '.tlscontact.com/services/customerservice/api/tls/appointment/book?client=' + countryCode + '&issuer=' + centerCode +'&formGroupId=' + groupId + '&timeslot=' + chosenDate + '%20' + chosenTime + '&appointmentType=' + aptType +'&accountType=INDI&lang=fr-fr';
    let apiPOSTHeaders = {
        "accept": "application/json, text/plain, */*",
        "accept-language": "en-US,en;q=0.9,de;q=0.8",
        "priority": "u=1, i",
        "recaptcha-token": recaptchaToken,
        "sec-ch-ua": "\"Google Chrome\";v=\"131\", \"Chromium\";v=\"131\", \"Not_A Brand\";v=\"24\"",
        "sec-ch-ua-arch": "\"x86\"",
        "sec-ch-ua-bitness": "\"64\"",
        "sec-ch-ua-full-version": "\"131.0.6778.140\"",
        "sec-ch-ua-full-version-list": "\"Google Chrome\";v=\"131.0.6778.140\", \"Chromium\";v=\"131.0.6778.140\", \"Not_A Brand\";v=\"24.0.0.0\"",
        "sec-ch-ua-mobile": "?0",
        "sec-ch-ua-model": "\"\"",
        "sec-ch-ua-platform": "\"Windows\"",
        "sec-ch-ua-platform-version": "\"15.0.0\"",
        "sec-fetch-dest": "empty",
        "sec-fetch-mode": "cors",
        "sec-fetch-site": "same-origin",
        "x-xsrf-token": xsrfToken
    };
    let apiPOSTReferrer = 'https://' + pathPrefix + countryCode + '.tlscontact.com/appointment/' + issueCntry +'/' + centerCode + '/' + groupId;

    let postResponse = await executePOST(apiPOSTUrl, apiPOSTHeaders, apiPOSTReferrer);

    if (postResponse) {
        if (postResponse.status === 200) {
            var postContent = await postResponse.json();
            if (postContent.status === "success") {
                is_booking_successful = true;
                const endTimestamp = performance.now();
                const elapsedTime = (endTimestamp - startTimestamp)/1000.0;
                return 'Créneau [' + chosenDate + ' @ ' + chosenTime + '] Réservé avec Succès. En: ' + elapsedTime.toFixed(2) + 's.' + ' | @ ' + i_start_ts;
            } else {
                let errMsg = postContent.status;
                errMsg = errMsg.toString();
                return 'Créneau [' + chosenDate + ' @ ' + chosenTime + ']: ' + 'Erreur durant la requête. Message du TLS: ' + errMsg + ' | @ ' + i_start_ts;
            }
        } else {
            let errMsg = postResponse.status;
            errMsg = errMsg.toString();
            return 'Créneau [' + chosenDate + ' @ ' + chosenTime + ']: ' + 'Erreur durant la requête. Message du TLS: ' + errMsg + ' | @ ' + i_start_ts;
        }
    } else {
        return 'Créneau [' + chosenDate + ' @ ' + chosenTime + ']: ' + 'Erreur durant la requête.' + ' | @ ' + i_start_ts;
    }
}


function handleGUI() {
    var localStV = undefined;
    var itemList = document.getElementById('itemHunterList');
    var selectedCenter = localStorage.getItem('selectedCenter');
    if (selectedCenter) {
        if (itemList) {
            itemList.value = selectedCenter;
        }
    } else {
        if (itemList) {
            localStorage.setItem('selectedCenter', itemList.value);
        }
    }

    let button_elt = document.getElementById('selectHunterButton');
    if (button_elt) {
        button_elt.addEventListener('click', async function (event) {
            // prevent page reload
            event.preventDefault();
    
            // main action
            localStorage.setItem('selectedCenter', itemList.value);
            if (!is_operation_in_progress) {
                console.log('TT-Hunter started operations..');
                await runExtension(true, '');
            }
        });
    }

    let test_button_elt = document.getElementById('testButton');
    if (test_button_elt) {
        test_button_elt.addEventListener('click', async function (event) {
            // prevent page reload
            event.preventDefault();
            console.log('Test operation started..');
            await runTest();
        });
    }

    let detect_button_elt = document.getElementById('detectButton');
    if (detect_button_elt) {
        detect_button_elt.addEventListener('click', async function (event) {
            // prevent page reload
            event.preventDefault();
            console.log('Detect operation started..');
            await runDetect();
        });
    }

    let search_connections_elt = document.getElementById('searchConnections');
    localStV = localStorage.getItem('searchConnections');
    if (localStV) {
        if (search_connections_elt) {
            search_connections_elt.value = localStV;
        }
    }
    if (search_connections_elt) {
        search_connections_elt.addEventListener('change', function() {
            localStorage.setItem('searchConnections', search_connections_elt.value);
            console.log('New search connections count: ', search_connections_elt.value);
        });
    }

    let parallel_connections_elt = document.getElementById('parallelConnections');
    localStV = localStorage.getItem('parallelConnections');
    if (localStV) {
        if (parallel_connections_elt) {
            parallel_connections_elt.value = localStV;
        }
    }
    if (parallel_connections_elt) {
        parallel_connections_elt.addEventListener('change', function() {
            localStorage.setItem('parallelConnections', parallel_connections_elt.value);
            console.log('New parallel connections count: ', parallel_connections_elt.value);
        });
    }

    let offset_connections_elt = document.getElementById('offsetConnections');
    localStV = localStorage.getItem('offsetConnections');
    if (localStV) {
        if (offset_connections_elt) {
            offset_connections_elt.value = localStV;
        }
    }
    if (offset_connections_elt) {
        offset_connections_elt.addEventListener('change', function() {
            localStorage.setItem('offsetConnections', offset_connections_elt.value);
            console.log('New offset connections count: ', offset_connections_elt.value);
        });
    }

    let search_connections_post_elt = document.getElementById('searchConnectionsPostTrigger');
    localStV = localStorage.getItem('searchConnectionsPostTrigger');
    if (localStV) {
        if (search_connections_post_elt) {
            search_connections_post_elt.value = localStV;
        }
    }
    if (search_connections_post_elt) {
        search_connections_post_elt.addEventListener('change', function() {
            localStorage.setItem('searchConnectionsPostTrigger', search_connections_post_elt.value);
            console.log('New search connections post-trigger count: ', search_connections_post_elt.value);
        });
    }

    let refresh_elt = document.getElementById('refreshHunterTime');
    localStV = localStorage.getItem('refreshHunterTime');
    if (localStV) {
        if (refresh_elt) {
            refresh_elt.value = localStV;
            let refresh_time_s = Number(localStV);
            clearInterval(timer_interval_id);
            timer_interval_id = setInterval(keep_session_alive, refresh_time_s*1000);
        }
    }
    if (refresh_elt) {
        refresh_elt.addEventListener('change', function() {
            localStorage.setItem('refreshHunterTime', refresh_elt.value);
            let refresh_time_s = Number(refresh_elt.value);
            console.log('New refresh time (s): ', refresh_time_s);
            clearInterval(timer_interval_id);
            timer_interval_id = setInterval(keep_session_alive, refresh_time_s*1000);
        });
    }

    let hard_refresh_elt = document.getElementById('refreshPageTimeout');
    localStV = localStorage.getItem('refreshPageTimeout');
    if (localStV) {
        if (hard_refresh_elt) {
            hard_refresh_elt.value = localStV;
            let hard_refresh_time_min = Number(localStV);
            clearInterval(hard_refresh_timer_interval_id);
            hard_refresh_timer_interval_id = setInterval(hard_refresh, hard_refresh_time_min*60*1000);
        }
    }
    if (hard_refresh_elt) {
        hard_refresh_elt.addEventListener('change', function() {
            localStorage.setItem('refreshPageTimeout', hard_refresh_elt.value);
            let hard_refresh_time_min = Number(hard_refresh_elt.value);
            console.log('New hard refresh time (min): ', hard_refresh_time_min);
            clearInterval(hard_refresh_timer_interval_id);
            hard_refresh_timer_interval_id = setInterval(hard_refresh, hard_refresh_time_min*60*1000);
        });
    }

    if (itemList) {
        itemList.addEventListener('change', function() {
            localStorage.setItem('selectedCenter', itemList.value);
            console.log('New selected center : ', itemList.value);
        });
    }

    let recaptchaCheckbox = document.getElementById('useRecaptchaSolver');
    localStV = localStorage.getItem('useRecaptchaSolver');
    if (localStV) {
        if (recaptchaCheckbox) {
            if (localStV == 'true') {
                recaptchaCheckbox.checked = true;
            } else {
                recaptchaCheckbox.checked = false;
            }
        }
    }
    if (recaptchaCheckbox) {
        recaptchaCheckbox.addEventListener('click', function() {
            localStorage.setItem('useRecaptchaSolver', recaptchaCheckbox.checked);
            if (recaptchaCheckbox.checked) {
                document.getElementById('customAlert').style.display = 'flex';
            }
        });
    }

    let keepAliveCheckbox = document.getElementById('keepAccountAlive');
    localStV = localStorage.getItem('keepAccountAlive');
    if (localStV) {
        if (keepAliveCheckbox) {
            if (localStV == 'true') {
                keepAliveCheckbox.checked = true;
            } else {
                keepAliveCheckbox.checked = false;
            }
            if (localStV) {
                clearInterval(alive_timer_interval_id);
                alive_timer_interval_id = setInterval(keep_alive_by_accnt_info, 60*1000);
            } else {
                clearInterval(alive_timer_interval_id);
            }
        }
    }
    if (keepAliveCheckbox) {
        keepAliveCheckbox.addEventListener('click', function() {
            localStorage.setItem('keepAccountAlive', keepAliveCheckbox.checked);
            if (keepAliveCheckbox.checked) {
                clearInterval(alive_timer_interval_id);
                alive_timer_interval_id = setInterval(keep_alive_by_accnt_info, 60*1000);
            } else {
                clearInterval(alive_timer_interval_id);
            }
        });
    }

    let considerPrimeBox = document.getElementById('considerPrime');
    localStV = localStorage.getItem('considerPrime');
    if (localStV) {
        if (considerPrimeBox) {
            if (localStV == 'true') {
                considerPrimeBox.checked = true;
            } else {
                considerPrimeBox.checked = false;
            }
        }
    }
    if (considerPrimeBox) {
        considerPrimeBox.addEventListener('click', function() {
            localStorage.setItem('considerPrime', considerPrimeBox.checked);
        });
    }

    document.getElementById('searchOptions').classList.add('active');
    const tabButtons = document.querySelectorAll('.tab-button');
    tabButtons.forEach(button => {
        button.addEventListener('click', function(event) {
            open_TT_Tab(event, this.getAttribute('data-tab'));
        });
    });

    let closeAlertButton = document.getElementById('closeAlertButton');
    closeAlertButton.addEventListener('click', function(event) {
        closeAlert();
    });

    localStorage.setItem('falcRecaptchaRequest', 'NO_CMD');
}

function padNumber(number) {
  return number < 10 ? '0' + number : number;
}

function getTimestamp() {
    let currentDate = new Date();
    
    let year = currentDate.getFullYear();
    let month = currentDate.getMonth() + 1;
    let day = currentDate.getDate();
    
    let hours = currentDate.getHours();
    let minutes = currentDate.getMinutes();
    let seconds = currentDate.getSeconds();
    let milliseconds = currentDate.getMilliseconds();
    
    let formattedDateTime = `${year}/${padNumber(month)}/${padNumber(day)} ${padNumber(hours)}:${padNumber(minutes)}:${padNumber(seconds)}.${padNumber(milliseconds, 3)}`;
    return formattedDateTime;
}


async function runKeepAlive() {
    let selectedCenter = get_active_center();
    if (selectedCenter) {
        const startTimestamp = performance.now();
        set_accnt_warning('Statut en cours..');
        let countryCode = centerInfo[selectedCenter]['country'];
        let pathPrefix = centerInfo[selectedCenter]['prefix'];
        let apiGETUrl = 'https://' + pathPrefix + countryCode + '.tlscontact.com/api/account';

        var getRsp = await executeGET(apiGETUrl);

        const endTimestamp = performance.now();
        const elapsedTime = (endTimestamp - startTimestamp)/1000.0;

        if (getRsp) {
            if (getRsp.status == 200) {
                set_accnt_info('Connecté. En: ' + elapsedTime.toFixed(2) + 's | @ ' + getTimestamp());
            } else if (getRsp.status == 401) {
                set_accnt_error('Déconnecté [401]. En: ' + elapsedTime.toFixed(2) + 's | @ ' + getTimestamp());
                localStorage.setItem('statError', 'Déconnecté [401]');
            } else {
                set_accnt_error('Erreur [' + getRsp.status.toString() + ']. En: ' + elapsedTime.toFixed(2) + 's | @ ' + getTimestamp());
                localStorage.setItem('statError', 'Erreur de connexion [' + getRsp.status.toString() + ']');
            }
        } else {
            set_accnt_error('Erreur. | @ ' + getTimestamp());
        }
    }
}


// main entry point.
async function runExtension(do_post, trigger_src) {
    // do_post = false; // debug point
    
    is_operation_in_progress = true;
    op_start_ts = getTimestamp();
    let sepa = '||FalconSePa||';
    if (operation_flag_interval_id) {
        clearInterval(operation_flag_interval_id);
    }
    operation_flag_interval_id = setInterval(reset_operation_flag, 60000);
    const startTimestamp = performance.now();
    if (trigger_src == 'TT-SIGNAL') {
        set_warning('Déclenchement TT-Signal en cours..');
    } else {
        set_warning('En cours..');
    }

    let tabUrl = window.location.href;
    let groupId = extractIdFromUrl(tabUrl);
    let goodUrl = isMatchingUrl(tabUrl);
    let inputWorkersCount = Number(document.getElementById('parallelConnections').value);
    let offsetConnections = Number(document.getElementById('offsetConnections').value);
    let parallelGetCount = Number(document.getElementById('searchConnections').value);
    let parallelGetCountPostTrigger = Number(document.getElementById('searchConnectionsPostTrigger').value);
    let useRecaptchaSolver = document.getElementById('useRecaptchaSolver').checked;
    let considerPrime = document.getElementById('considerPrime').checked;

    console.log('useRecaptchaSolver : ', useRecaptchaSolver);
    console.log('considerPrime : ', considerPrime);

    if (!goodUrl) {
        set_warning('Allez à la page des rendez-vous.');
    } else {
        let xsrfToken = getCookie('XSRF-TOKEN');
        let captchaId = getCaptchaId();
        let selectedCenter = get_active_center();
        console.log('selectedCenter : ', selectedCenter);

        let aptType = centerInfo[selectedCenter]['aptType']
        let countryCode = centerInfo[selectedCenter]['country']
        let pathPrefix = centerInfo[selectedCenter]['prefix'];
        let centerCode = centerInfo[selectedCenter]['code']
        let issueCntry = centerInfo[selectedCenter]['issueCountry']
        let apiGETUrl = 'https://' + pathPrefix + countryCode + '.tlscontact.com/services/customerservice/api/tls/appointment/' + issueCntry +'/' + centerCode + '/table?client=' + countryCode + '&formGroupId=' + groupId + '&appointmentType=' + aptType + '&appointmentStage=appointment';
        let recapSolutions = [];

        if (trigger_src == 'TT-SIGNAL') {
          parallelGetCount = parallelGetCountPostTrigger;
        }

        updateUidCookie(generateUUID());
        var validSlotsDict = {};
        if (!considerPrime) {
          validSlotsDict = await executeParallelGET(apiGETUrl, parallelGetCount);
        } else {
          let primeGETUrl = 'https://' + pathPrefix + countryCode + '.tlscontact.com/services/customerservice/api/tls/appointment/' + issueCntry +'/' + centerCode + '/table?client=' + countryCode + '&formGroupId=' + groupId + '&appointmentType=prime%20time&appointmentStage=appointment';
          validSlotsDict = await executeMainAndPrimeGET(apiGETUrl, primeGETUrl);
          if (validSlotsDict.type == 'PRIME') {
              aptType = 'prime%20time';
          }
        }

        if (validSlotsDict.status) {
            if (validSlotsDict.status === 200) {
                let nbValidApts = validSlotsDict.validSlots.length;
    
                console.log("nbValidApts = ", nbValidApts);
                if (do_post) {
                    if (nbValidApts > 0) {
                        let chosenAptIdx = Math.floor(Math.random() * nbValidApts);

                        // start the booking request
                        var nbWorkers = Math.max(1, Math.min(nbValidApts, inputWorkersCount));
                        let booking_results = [];

                        // request reCAPTCHA solutions
                        if (useRecaptchaSolver) {
                            let recapSolutionStr = await poll_recaptcha_solutions_from_falcon(nbWorkers, captchaId, tabUrl);
                            for (let recapSolution of recapSolutionStr.split(sepa)) {
                                pRecapSolution = recapSolution.trim();
                                if (pRecapSolution != '') {
                                    recapSolutions.push(pRecapSolution);
                                }
                            }
                            nbWorkers = Math.min(nbWorkers, recapSolutions.length);
                            console.log('recapSolutions : ', recapSolutions);
                        }

                        for (let i = 0; i < nbWorkers; i++) {
                            let chosenDate = validSlotsDict.validSlots[chosenAptIdx].date;
                            let chosenTime = validSlotsDict.validSlots[chosenAptIdx].time;
                            console.log("trying to book slot : " + chosenDate + ' @ ' + chosenTime);

                            let recapMode = 'NONE';
                            if (useRecaptchaSolver) {
                                recapMode = recapSolutions[i];
                            }
                            booking_results.push(parallel_booking_task(selectedCenter, chosenDate, chosenTime, captchaId, groupId, xsrfToken, startTimestamp, recapMode, op_start_ts, aptType));
                            chosenAptIdx = (chosenAptIdx+1)%nbValidApts;

                            if (offsetConnections > 0) {
                                await sleep(offsetConnections*1000);
                            }
                        }

                        let accum_result = '';
                        for (let booking_result of booking_results) {
                            const async_result = await booking_result;
                            accum_result += async_result + '<br>';
                            console.log(async_result);
                        }

                        if (trigger_src != '') {
                            accum_result += 'Trigger: ' + trigger_src + '<br>';
                        }

                        if (current_motif == '') {
                            current_motif = await quickDetect();
                        }
                        
                        if (is_booking_successful) {
                            set_positive(accum_result);
                            localStorage.setItem('statReport', selectedCenter+'<br>'+current_motif+'<br>'+accum_result+'Calendar:'+JSON.stringify(validSlotsDict)+'<br>');
                        } else {
                            set_error(accum_result);
                        }

                    } else {
                        const endTimestamp = performance.now();
                        const elapsedTime = (endTimestamp - startTimestamp)/1000.0;
                        set_info('Pas de rendez-vous disponible. En: ' + elapsedTime.toFixed(2) + 's | @ ' + op_start_ts);
                    }
                } else {
                    const endTimestamp = performance.now();
                    const elapsedTime = (endTimestamp - startTimestamp)/1000.0;
                    set_info(nbValidApts.toString() + ' rendez-vous disponible(s). En: ' + elapsedTime.toFixed(2) + 's | @ ' + op_start_ts);
                }
            } else if (validSlotsDict.status === 404) {
                const endTimestamp = performance.now();
                const elapsedTime = (endTimestamp - startTimestamp)/1000.0;
                set_info('Pas de rendez-vous disponible. En: ' + elapsedTime.toFixed(2) + 's | @ ' + op_start_ts);
            } else {
                let errMsg = '';
                if (validSlotsDict.status === 400) {
                    errMsg = 'Bad Request [400]';
                } else if (validSlotsDict.status === 401) {
                    errMsg = 'Unauthorized [401]';
                } else if (validSlotsDict.status === 403) {
                    errMsg = 'Forbidden [403]';
                } else if (validSlotsDict.status === 429) {
                    errMsg = 'Too Many Requests [429]';
                    try {
                        let retryAfter = validSlotsDict.headers.get('Retry-After');
                        retryAfter = retryAfter/60;
                        errMsg += ' | Durée de blocage: ' + retryAfter.toFixed(2) + 'min';
                    } catch (error) {
                    }
                } else if (validSlotsDict.status === 500) {
                    errMsg = 'Internal Server Error [500]';
                } else {
                    errMsg = validSlotsDict.status;
                }
                errMsg = errMsg.toString();
                console.log('Erreur durant la requête GET. Message du TLS: ' + errMsg);
                set_error('Erreur durant la requête. Message du TLS: ' + errMsg + ' | @ ' + op_start_ts);
                localStorage.setItem('statError', 'Erreur durant la requête GET. Message du TLS: ' + errMsg);
            }
        } else {
            console.log('Erreur durant la requête GET');
            set_error('Erreur durant la requête.' + ' | @ ' + op_start_ts);
        }
    }
    console.log('TT-Hunter finished.');
    is_operation_in_progress = false;
}

async function runTest() {
    set_warning('Test en cours..');

    function waitForRecaptchaReady(timeout = 5000) {
        return new Promise((resolve, reject) => {
            const timer = setTimeout(() => {
                reject(new Error('reCAPTCHA ready timeout'));
            }, timeout);

            grecaptcha.ready(() => {
                clearTimeout(timer);
                resolve();
            });
        });
    }

    try {
        await waitForRecaptchaReady();
        set_positive('reCAPTCHA OK.');
    } catch (error) {
        set_error('Erreur reCAPTCHA !');
    }

    console.log('Test operation ended.');
}


function lookForCenter(i_center_code, i_apt_type, i_country, i_issue_country) {
    for (let key in centerInfo) {
        if ((centerInfo[key].aptType == i_apt_type)&&(centerInfo[key].code == i_center_code)&&(centerInfo[key].country == i_country)&&(centerInfo[key].issueCountry == i_issue_country)) {
            return key;
        }
    }
    return '';
}

function getTitleForCenterCode(i_center_code) {
    for (let key in centerInfo) {
        if (centerInfo[key].code === i_center_code) {
            return centerInfo[key].title;
        }
    }
    return i_center_code;
}


function updateCenterSelection(i_center, i_center_code, i_apt_type, i_country, i_issue_country, i_prefix) {
    var hunterItemList = document.getElementById('itemHunterList');
    var custom_key_str = 'custom-'+i_center_code;
    if (!hunterItemList) {
        return;
    }
    if (i_center in centerInfo) {
        hunterItemList.value = i_center;
    } else {
        const newOption = document.createElement('option');
        newOption.value = custom_key_str;
        newOption.text = i_center;
        hunterItemList.add(newOption);
        hunterItemList.value = custom_key_str;

        centerInfo[custom_key_str] = {
            'code': i_center_code,
            'country': i_country,
            'aptType': i_apt_type,
            'issueCountry': i_issue_country,
            'title': getTitleForCenterCode(i_center_code),
            'prefix': i_prefix
        };

        console.log('New center has been added : ', centerInfo[custom_key_str]);
    }
    localStorage.setItem('selectedCenter', hunterItemList.value);
}


async function quickDetect() {
    let tabUrl = window.location.href;
    let retV = '';

    if (isMatchingUrl(tabUrl)) {
        let groupId = extractIdFromUrl(tabUrl);
        let country = extractCountryFromUrl(tabUrl);
        let issueCountry = extractIssueCountryFromUrl(tabUrl);
        let centerCode = extractCenterCodeFromUrl(tabUrl);
        let domainName = extractDomainNameFromUrl(tabUrl);
        let prefix = extractPrefixFromUrl(tabUrl);
        let fgID = '';
        let aptType = '';
        let travelDescription = '';
        let detectedCenter = '';

        let infoAccntUrl = domainName + '/services/customerservice/api/tls/formgroup?client=' + country + '&issuer=' + centerCode;
        var fgIdRequest = await executeGET(infoAccntUrl);
        if (fgIdRequest) {
            if (fgIdRequest.status === 200) {
                const jsonResponse = await fgIdRequest.json();
                if (Array.isArray(jsonResponse) && jsonResponse.length > 0) {
                    fgID = jsonResponse[0].fg_id;
                }
            }
        }

        if (fgID != '') {
            let formAccntUrl = domainName + '/services/customerservice/api/tls/forms/list/' + country + '/' + centerCode + '?fg_id=' + fgID;
            var formInfoRequest = await executeGET(formAccntUrl);
            if (formInfoRequest) {
                if (formInfoRequest.status === 200) {
                    const jsonResponse = await formInfoRequest.json();
                    if (Array.isArray(jsonResponse) && jsonResponse.length > 0) {
                        aptType = jsonResponse[0].fi_appointment_type;
                        travelDescription = jsonResponse[0].f_trav_purpose;
                    }
                }
            }
        }

        retV = aptType + '<br>' + travelDescription;
    }

    return retV;
}


async function runDetect() {
    set_warning('Détection du centre en cours..');
    let tabUrl = window.location.href;

    if (isMatchingUrl(tabUrl)) {
        let groupId = extractIdFromUrl(tabUrl);
        let country = extractCountryFromUrl(tabUrl);
        let issueCountry = extractIssueCountryFromUrl(tabUrl);
        let centerCode = extractCenterCodeFromUrl(tabUrl);
        let domainName = extractDomainNameFromUrl(tabUrl);
        let prefix = extractPrefixFromUrl(tabUrl);
        let fgID = '';
        let aptType = '';
        let travelDescription = '';
        let detectedCenter = '';

        let infoAccntUrl = domainName + '/services/customerservice/api/tls/formgroup?client=' + country + '&issuer=' + centerCode;
        var fgIdRequest = await executeGET(infoAccntUrl);
        if (fgIdRequest) {
            if (fgIdRequest.status === 200) {
                const jsonResponse = await fgIdRequest.json();
                if (Array.isArray(jsonResponse) && jsonResponse.length > 0) {
                    fgID = jsonResponse[0].fg_id;
                }
            }
        }

        if (fgID != '') {
            let formAccntUrl = domainName + '/services/customerservice/api/tls/forms/list/' + country + '/' + centerCode + '?fg_id=' + fgID;
            var formInfoRequest = await executeGET(formAccntUrl);
            if (formInfoRequest) {
                if (formInfoRequest.status === 200) {
                    const jsonResponse = await formInfoRequest.json();
                    if (Array.isArray(jsonResponse) && jsonResponse.length > 0) {
                        aptType = encodeURIComponent(jsonResponse[0].fi_appointment_type);
                        travelDescription = jsonResponse[0].f_trav_purpose;
                    }
                }
            }
        }

        current_motif = decodeURIComponent(aptType) + '<br>' + travelDescription;

        if (aptType != '') {
            detectedCenter = lookForCenter(centerCode, aptType, country, issueCountry);
            console.log('Detected center : ', detectedCenter);

            if (detectedCenter == '') {
                detectedCenter = '::' + getTitleForCenterCode(centerCode) + ' (' + decodeURIComponent(aptType) + ')/' + issueCountry.toUpperCase();
            }

            updateCenterSelection(detectedCenter, centerCode, aptType, country, issueCountry, prefix);
        } else {
            set_error('Erreur. Vérifier votre formulaire.');
        }

        set_positive(travelDescription + ' | ' + decodeURIComponent(aptType) + ' | ' + issueCountry + ' -> ' + country);
    } else {
        set_error('Mauvaise page.');
    }
    console.log('Detect operation ended.');
}

function set_warning(i_message) {
    let messageZone = document.getElementById("messageZone");
    messageZone.innerHTML = i_message;
    messageZone.style.color = '#eb9e34';
}

function set_error(i_message) {
    let messageZone = document.getElementById("messageZone");
    messageZone.innerHTML = i_message;
    messageZone.style.color = '#d1112e';
}

function set_positive(i_message) {
    let messageZone = document.getElementById("messageZone");
    messageZone.innerHTML = i_message;
    messageZone.style.color = '#0b8f4d';
}

function set_info(i_message) {
    let messageZone = document.getElementById("messageZone");
    messageZone.innerHTML = i_message;
    messageZone.style.color = '#0099cc';
}

function set_accnt_info(i_message) {
    let messageZone = document.getElementById("messageConnZone");
    messageZone.innerHTML = i_message;
    messageZone.style.color = '#0099cc';
}

function set_accnt_warning(i_message) {
    let messageZone = document.getElementById("messageConnZone");
    messageZone.innerHTML = i_message;
    messageZone.style.color = '#eb9e34';
}

function set_accnt_error(i_message) {
    let messageZone = document.getElementById("messageConnZone");
    messageZone.innerHTML = i_message;
    messageZone.style.color = '#d1112e';
}

function isMatchingUrl(url) {
    return url.includes('tlscontact.com/appointment/');
}

function extractIdFromUrl(url) {
    let regex = /\/(\d+)$/;
    let match = url.match(regex);

    if (match && match[1]) {
        return match[1];
    } else {
        return null;
    }
}

function extractPrefixAndCountryFromUrl(url) {
    let res = '';
    if (url.includes('.tlscontact.com')) {
        res = url.split('.tlscontact.com')[0].trim();
        if (res.includes('//')) {
            res = res.split('//')[1].trim();
        }
    }
    return res;
}

function extractCountryFromUrl(url) {
    let res = extractPrefixAndCountryFromUrl(url);
    if (res.includes('-')) {
        res = res.split('-')[1].trim();
    }
    return res;
}

function extractPrefixFromUrl(url) {
    let res = extractPrefixAndCountryFromUrl(url);
    if (res.includes('-')) {
        res = res.split('-')[0].trim()+'-';
        return res;
    } else {
        return '';
    }
}

function extractIssueCountryFromUrl(url) {
    let cntry = '';
    if (url.includes('.tlscontact.com/appointment/')) {
        cntry = url.split('.tlscontact.com/appointment/')[1].trim();
        if (cntry.includes('/')) {
            cntry = cntry.split('/')[0].trim();
        }
    }
    return cntry;
}

function extractCenterCodeFromUrl(url) {
    let centerCode = '';
    let grpId = extractIdFromUrl(url);
    if (url.includes('/'+grpId)) {
        centerCode = url.split('/'+grpId)[0].trim();
        if (centerCode.includes('/')) {
            centerCode = centerCode.split('/').pop().trim();
        }
    }
    return centerCode;
}

function extractDomainNameFromUrl(url) {
    let domainName = '';
    if (url.includes('.com/')) {
        domainName = url.split('.com/')[0].trim() + '.com';
    }
    return domainName;
}

function getCookie(name) {
    return document.cookie.split('; ').find(cookie => cookie.startsWith(name + '='))?.split('=')[1] || null;
}

function getCaptchaId() {
    let captchaElts = document.getElementsByClassName('grecaptcha-logo')
    if (captchaElts.length > 0) {
        let urlCaptcha = captchaElts[0].getElementsByTagName('iframe')[0].src;
        let urlParams = new URLSearchParams(urlCaptcha);
        let captchaId = urlParams.get('k');
        return captchaId;
    }
    return '';
}

function generateUUID() {
    const randomBytes = crypto.getRandomValues(new Uint8Array(16));
    let byteString = '';

    for (let i = 0; i < randomBytes.length; i++) {
        byteString += String.fromCharCode(randomBytes[i]);
    }

    let base64String = btoa(byteString);
    base64String = base64String.replace(/\+/g, 'A').replace(/\//g, 'B');

    return base64String;
}

function updateUidCookie(newValue) {
    const name = 'uid';
    const domain = '.tlscontact.com';
    const date = new Date();

    date.setTime(date.getTime() + (7 * 24 * 60 * 60 * 1000));
    let expires = "; expires=" + date.toUTCString();
    document.cookie = name + "=" + (newValue || "") + expires + "; path=/; domain=" + domain;
}

async function executeGET(getURL) {
    return new Promise((resolve) => {
        fetch(getURL)
          .then(response => response)
          .then(data => {
             resolve(data);
          })
          .catch(error => {
             console.log("Error making GET request:", error);
             resolve(undefined);
        });
    });
}


async function getTheValidSlotsFromRequest(rq_response) {
    var result = {
        validSlots: [],
        status: rq_response ? rq_response.status : undefined,
        headers: rq_response ? rq_response.headers : undefined,
    };

    if (rq_response) {
      if (rq_response.status === 200) {
        const calendarTable = await rq_response.json();
        result.validSlots = getTheValidSlots(calendarTable);
      }
    }

    return result;
}


async function executeParallelGET(getURL, n) {
  var result = {
    validSlots: [],
    status: undefined,
    headers: undefined
  };

  try {
    for (let i = 0; i < n; i++) {
      const response = await fetch(getURL);
      result = await getTheValidSlotsFromRequest(response);

      if (result.validSlots.length > 0) {
        console.log('Calendrier :', result);
        return result;
      }
    }

  } catch (error) {
    console.log("Error making parallel GET requests: ", error);
  }

  return result;
}



async function executeMainAndPrimeGET(main_url, prime_url) {
  var result = {
    validSlots: [],
    status: undefined,
    headers: undefined,
    type: undefined
  };

  try {
      var response = await fetch(main_url);
      result = await getTheValidSlotsFromRequest(response);
      result.type = 'MAIN';
      if (result.validSlots.length == 0) {
        response = await fetch(prime_url);
        result = await getTheValidSlotsFromRequest(response);
        result.type = 'PRIME';
      }
      console.log('Calendrier :', result);
      return result;
  } catch (error) {
    console.log("Error making GET requests: ", error);
  }

  return result;
}



async function executePOST(postURL, postHeaders, postReferrer) {
    return new Promise((resolve) => {
        fetch(postURL,
            {
                "headers": postHeaders,
                "referrer": postReferrer,
                "referrerPolicy": "strict-origin-when-cross-origin",
                "body": null,
                "method": "POST",
                "mode": "cors",
                "credentials": "include"
            })
          .then(response => response)
          .then(data => {
             resolve(data);
          })
          .catch(error => {
             console.log("Error making POST request:", error);
             resolve(undefined);
        });
    });
}

function getTheValidSlots(inJsonData) {
    let validSlots = [];

    Object.keys(inJsonData).forEach(date => {
        Object.keys(inJsonData[date]).forEach(time => {
            if (inJsonData[date][time] === 1) {
            validSlots.push({
              date: date,
              time: time
            });
            }
        });
    });

    return validSlots;
}
